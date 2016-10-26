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
public class BinOp implements Expr {

    private final char op;
    private final Expr left;
    private final Expr right;

    public BinOp(char op, Expr left, Expr right) {
        this.op = op;
        this.left = left;
        this.right = right;
    }

    public char getOp() {
        return op;
    }

    public Expr getLeft() {
        return left;
    }

    public Expr getRight() {
        return right;
    }

    public int eval() {
        int lv = left.eval();
        int rv = right.eval();
        switch (op) {
            case '+':
                return lv + rv;
            case '*':
                return lv * rv;
            case '-':
                return lv - rv;
            case '/':
                return lv / rv;
            default:
                throw new RuntimeException("unknown operation: " + op);
        }
    }
    
    private static String wrap(String s) {
       return '(' + s + ')'; 
    }

    @Override
    public String toString() {  // !!! generate only necessary parentheses
        return wrap(left.toString() + op + right.toString());
    }

    @Override
    public int priority() {
           switch (op) {
            case '+':
                return 2;
            case '*':
                return 1;
            case '-':
                return 2;
            case '/':
                return 1;
            default:
                throw new RuntimeException("unknown operation: " + op);
        }
    }

}
