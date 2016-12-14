/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcclient;

import java.io.IOException;
import model.Customer;
import model.CustomerException;

public class ClientMain {
    public static void main(String[] args) throws IOException, CustomerException {
        CustomerProxy cp = new CustomerProxy();
        cp.add(new Customer("Tom"));
        System.out.println(cp.all());
    }
}
