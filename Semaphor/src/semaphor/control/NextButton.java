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
public class NextButton extends SemaphorControllButton {

    public NextButton(Controller controller) {
        super(controller);
        setText("Next");
        setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                controller.next();
            }
        });
    }

}
