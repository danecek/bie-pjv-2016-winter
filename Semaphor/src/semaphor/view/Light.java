/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class Light extends StackPane {

    private Color color;
    Circle circ;

    public Light(double radius, Color c) {
        this.color = c;
        getChildren().add(circ = new Circle(radius, c));
    }

    public void setOn(boolean on) {
        if (on) {
            circ.setFill(color);
        } else {
            circ.setFill(Color.DARKGREY);
        }
    }


    public Color getColor() {
        return color;
    }

}
