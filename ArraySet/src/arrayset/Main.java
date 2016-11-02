/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayset;

import java.util.Iterator;

/**
 *
 * @author danecek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArratSet as = new ArratSet();
        System.out.println(as);
        as.add(1);
        System.out.println(as);
        as.add(2);
        System.out.println(as);
        as.add(2);
        System.out.println(as);
        for (Iterator<Integer> iterator = as.iterator(); iterator.hasNext();) {
            Integer act = iterator.next();
            System.out.println(act);
        }
        as.clear();
        System.out.println(as);
        as.remove(1);
        System.out.println(as);
        as.remove(2);
        System.out.println(as);
    }

}
