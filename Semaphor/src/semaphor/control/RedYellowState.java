/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import javafx.scene.paint.Color;

public class RedYellowState extends State {
    
    public static final RedYellowState inst = new RedYellowState();

    private RedYellowState() {
        super(Color.RED, Color.YELLOW);
    }

    @Override
    public State nextState() {
        return GreenState.inst;
    }
    
}
