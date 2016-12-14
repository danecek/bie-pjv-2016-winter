/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcserver;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.CustomerException;
import org.apache.derby.jdbc.EmbeddedDriver;

/**
 *
 * @author danecek
 */
public class CustomerDAO implements Facade {

    PreparedStatement addCustomerPS;
    PreparedStatement allCustomersPS;

    static String urlDB = "jdbc:derby:/home/users/d/danecek/customersPJV; create=true";

    public CustomerDAO() throws SQLException {
        new EmbeddedDriver();
        Connection conn = DriverManager.getConnection(urlDB);
        DatabaseMetaData dbmd = conn.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, "CUSTOMERS", null);
        if (!rs.next()) {
            System.out.println("CREATE TABLE BOOKS");
            Statement stm = conn.createStatement();
            stm.executeUpdate("CREATE TABLE CUSTOMERS"
                    + "(ID INT NOT NULL GENERATED ALWAYS AS IDENTITY,"
                    + "NAME   VARCHAR(50)," 
                    + "PRIMARY KEY (ID))");

        }

        addCustomerPS = conn.prepareStatement("INSERT INTO CUSTOMERS VALUES(DEFAULT, ?)");
        allCustomersPS = conn.prepareStatement("SELECT * FROM CUSTOMERS");
    }

    @Override
    public void add(Customer c) throws CustomerException {
        try {
            addCustomerPS.setString(1, c.getName());
            addCustomerPS.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new CustomerException(ex);
        }

    }

    @Override
    public Collection<Customer> all() throws CustomerException {
        try {
            ResultSet rs = allCustomersPS.executeQuery();
            ArrayList<Customer> customers = new ArrayList<>();
            while (rs.next()) {
                customers.add(new Customer(rs.getInt(1), rs.getString(2)));
            }
            return customers;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new CustomerException(ex);
        }
    }

}
