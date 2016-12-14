/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CustomerException;
import protocol.Command;

/**
 *
 * @author danecek
 */
public class ClientTask extends Thread {

    ObjectInputStream ois;
    ObjectOutputStream oos;
    private Facade f;

    public ClientTask(Socket s, Facade f) throws IOException {
        this.f = f;
        oos = new ObjectOutputStream(s.getOutputStream());
        ois = new ObjectInputStream(s.getInputStream());
    }

    @Override
    public void run() {
        for (;;) {
            try {
                System.out.println("waiting for command");
                Command com = (Command) ois.readObject();
                Object res;
                try {
                    res = com.execute(f);
                } catch (CustomerException ex) {
                    res = ex;
                }
                oos.writeObject(res);
                oos.flush();
            } catch (IOException ex) {
                Logger.getLogger(ClientTask.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClientTask.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
