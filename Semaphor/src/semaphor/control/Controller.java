/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import java.util.Observable;
import semaphor.view.SemaphorPanel;


public class Controller extends Observable {

    /**
     * @return the actualState
     */
    public State getActualState() {
        return actualState;
    }
    
    private State actualState = RedState.inst;
    
    public void next() {
        actualState = actualState.nextState();
//        semaphorPanel.set(actualState.getOnColors());
        this.setChanged();
        this.notifyObservers();
    }
    
    
}
