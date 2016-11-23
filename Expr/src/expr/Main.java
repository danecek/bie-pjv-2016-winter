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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Const c3 = new Const(3);
        BinOp bop = new BinOp('*',
                              new BinOp('+',
                                        new Const(10),
                                        new Const(2)),
                              c3);
        System.out.println(bop);
        System.out.println(bop.eval());
        bop.store("expr.data");
        bop = null;
        Expr bopCopy = Expr.load("expr.data");
        System.out.println(bopCopy);
        System.out.println(bopCopy.eval());
        
    }

}
