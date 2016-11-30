/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.control;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.paint.Color;

public abstract class State {

    private Set<Color> onColors;

    protected State(Color... onColors) {
        this.onColors = new HashSet<>(Arrays.asList(onColors));
    }

    public abstract State nextState();

    /**
     * @return the onColors
     */
    public Set<Color> getOnColors() {
        return onColors;
    }

}
