/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;


public class Token {
    
    TokenEnum  tokenEnum;

    public Token(TokenEnum tokenEnum) {
        this.tokenEnum = tokenEnum;
    }

    @Override
    public String toString() {
        return tokenEnum.toString();
    }
    
}
