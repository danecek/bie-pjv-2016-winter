/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transletor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danecek
 */
public class Translator {

    Map<String, Double> values = new HashMap<>();

    public Translator() {
        values.put("zero", new Double(0));
        values.put("one", 1.0);  // autoboxing
        values.put("two", 2.0);  // autoboxing
        values.put("three", 3.0);  // autoboxing
        values.put("four", 4.0);  // autoboxing
    }

    public double translate(String word) {
        //   if (word.equals("three")) return 3;
        return values.getOrDefault(word, Double.NaN);
    }

}
