/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import semaphor.control.Controller;

/**
 *
 * @author danecek
 */
public class SemaphorPanel extends VBox implements Observer {

    public SemaphorPanel(double radius, Color ... colors) {
        setPadding(new Insets(20));
        setSpacing(20);
        for (Color c : colors) {
            getChildren().add(new Light(radius, c));
        }
    }  

    public void set(Set<Color> onColors) {
        for (Node n : getChildren()) {
            Light l = (Light) n;
            l.setOn(onColors.contains(l.getColor()));
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        Controller c = (Controller) o;
        set(c.getActualState().getOnColors());
    }
    
}
