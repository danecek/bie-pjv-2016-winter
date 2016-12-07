/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author danecek
 */
public class StopButton extends SemaphorControllButton {

    public StopButton(Controller controller) {
        super(controller);
        setText("Stop");
        setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controller.stop();
            }
        });
    }

}
