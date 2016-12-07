/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import javafx.scene.control.Button;

/**
 *
 * @author danecek
 */
public abstract class SemaphorControllButton extends Button {
    Controller controller;

    public SemaphorControllButton(Controller controller) {
        this.controller = controller;
    }
    
    
    
}
