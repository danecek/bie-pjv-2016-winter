/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.io.IOException;
import java.io.Reader;

public class Scanner {

    Reader reader;
    char actualChar;
    private boolean eof = false;

    private void nextChar() throws IOException {
        int c = reader.read();
        if (c < 0) {
            eof = true;
        } else {
            actualChar = (char) c;
        }
    }

    public Scanner(Reader reader) throws IOException {
        this.reader = reader;
        nextChar();
    }

    public Token nextToken() throws Exception {
        if (eof) {
            throw new RuntimeException("end of file");
        }
        switch (actualChar) {
            case '+': {
                nextChar();
                return new Token(TokenEnum.PLUS);
            }
            case '-': {
                nextChar();
                return new Token(TokenEnum.MNS);
            }
            case '*': {
                nextChar();
                return new Token(TokenEnum.MLT);
            }
            
            case '/': {
                nextChar();
                return new Token(TokenEnum.DIV);
            }
            
            default: throw new Exception("unknown char: " + actualChar);

        }

    }

    /**
     * @return the eof
     */
    public boolean isEof() {
        return eof;
    }

}
