/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) throws IOException, Exception {
        Scanner s = new Scanner(new StringReader("+  +  /*-"));
        while (!s.isEof()) {
            System.out.println(s.nextToken());
        }
    }
}
