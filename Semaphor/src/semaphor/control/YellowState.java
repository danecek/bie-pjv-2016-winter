/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import javafx.scene.paint.Color;

public class YellowState extends State {
    
    public static final YellowState inst = new YellowState();

    public YellowState() {
        super(Color.YELLOW);
    }

    @Override
    public State nextState() {
        return RedState.inst;
    }
    
}
