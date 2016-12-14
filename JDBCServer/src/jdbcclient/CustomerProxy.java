/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcclient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbcserver.Facade;
import model.Customer;
import model.CustomerException;
import protocol.AddCommand;
import protocol.AllCommand;
import protocol.Command;

public class CustomerProxy implements Facade {

    private final ObjectInputStream ois;
    private final ObjectOutputStream oos;

    @Override
    public void add(Customer c) throws CustomerException {
        sent(new AddCommand(c));
    }

    @Override
    public Collection<Customer> all() throws CustomerException  {
        return (Collection<Customer>) sent(new AllCommand());
    }

    private Object sent(Command command) throws CustomerException {
        try {
            oos.writeObject(command);
            oos.flush();
            Object res = ois.readObject();
            if (res instanceof Exception)
                throw (CustomerException)res;
            return res;
        } catch (ClassNotFoundException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public CustomerProxy() throws IOException {
        Socket s = new Socket("localhost", 3333);
        s.setSoTimeout(2000);
        ois = new ObjectInputStream(s.getInputStream());
        oos = new ObjectOutputStream(s.getOutputStream());

    }

}
