/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import javafx.scene.paint.Color;

public class GreenState extends State {
    
    public static final GreenState inst = new GreenState();

    private GreenState() {
        super(Color.GREEN);
    }

    @Override
    public State nextState() {
        return YellowState.inst;
    }
    
}
