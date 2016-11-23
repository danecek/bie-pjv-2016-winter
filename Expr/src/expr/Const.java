/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expr;

/**
 *
 * @author danecek
 */
public class Const implements Expr {

    private final int value;

    public Const(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    @Override
    public int eval() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public int priority() {
        return 0;
    }

}
