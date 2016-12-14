/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import java.io.Serializable;
import jdbcserver.Facade;
import model.CustomerException;


public abstract class Command implements Serializable {

    public abstract Object execute(Facade f) throws CustomerException;
    
}
