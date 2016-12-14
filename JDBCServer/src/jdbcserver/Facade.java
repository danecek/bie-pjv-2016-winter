/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcserver;

import java.util.Collection;
import model.Customer;
import model.CustomerException;

public interface Facade {

    void add(Customer c) throws CustomerException;

    Collection<Customer> all() throws CustomerException;

}
