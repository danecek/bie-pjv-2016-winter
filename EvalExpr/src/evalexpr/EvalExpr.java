/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalexpr;

/**
 *
 * @author danecek
 */
public class EvalExpr {

    static int parseInt(String num) {  // Integer.parseInt()
        int value = 0;
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            if (!Character.isDigit(digit)) {
                throw new NumberFormatException(num);
            }
            value = value * 10 + digit - '0';
        }
        return value;
    }

    static int evalExpr(String[] args) {
        if (args.length % 2 != 1) {
            throw new IllegalArgumentException("invalid expression");
        }
        int result = parseInt(args[0]);
        for (int i = 1; i < args.length; i += 2) {
            int leftOp = parseInt(args[i + 1]);
            switch (args[i]) {
                case "+":
                    result += leftOp;
                    break;
                case "-":
                    result -= leftOp;
                    break;
                case "*":
                    result *= leftOp;
                    break;
                case "/":
                    result /= leftOp;
                    break;
                default: throw new RuntimeException("unknovn operator");
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(evalExpr(args));

    }

}
