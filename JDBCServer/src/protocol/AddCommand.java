/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import jdbcserver.Facade;
import model.Customer;
import model.CustomerException;


public class AddCommand extends Command {
    
    Customer c;

    public AddCommand(Customer c) {
        this.c = c;
    }
    
    @Override
    public Object execute(Facade f) throws CustomerException {
        f.add(c);
        return "";
    }
    
}
