/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

public class Customer implements Serializable{

    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + '}';
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
