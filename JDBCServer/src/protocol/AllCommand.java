/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import jdbcserver.Facade;
import model.CustomerException;


public class AllCommand extends Command {

    @Override
    public Object execute(Facade f) throws CustomerException {
        return f.all();
    }

    public AllCommand() {
    }
}
