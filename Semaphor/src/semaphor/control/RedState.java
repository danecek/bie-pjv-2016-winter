/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import javafx.scene.paint.Color;

public class RedState extends State {
    
    public static final RedState inst = new RedState();

    private RedState() {
        super(Color.RED);
    }

    @Override
    public State nextState() {
        return RedYellowState.inst;
    }
    
}
