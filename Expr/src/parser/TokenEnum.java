/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author danecek
 */
public enum TokenEnum {
    NUM(""),
    LP("("),
    RP(")"),
    MLT("*"),
    DIV("/"),
    PLUS("+"),
    MNS("-"),
    LS("<<"),
    RS(">>");

    String representation;

    private TokenEnum(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return representation;
    }

}
