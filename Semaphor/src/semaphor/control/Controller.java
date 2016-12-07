/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import java.util.Observable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private boolean runFl;
    ExecutorService es = Executors.newCachedThreadPool();
    
        void start() {
        runFl = true;
        es.execute(new Runnable() {
            @Override
            public void run() {
                while (runFl) {
                    next();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

//    void start() {
//        runFl = true;
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (runFl) {
//                    next();
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        }).start();
//    }

    void stop() {
        runFl = false;
    }

}
