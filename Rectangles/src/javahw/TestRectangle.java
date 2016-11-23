/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw;

/**
 *
 * @author danecek
 */
public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 1, 1, 1);
        Rectangle r2 = new Rectangle(1, 2, 1, 1);
        System.out.println(r.union(r2));  // [0, 2, 2, 2]
    }
}
