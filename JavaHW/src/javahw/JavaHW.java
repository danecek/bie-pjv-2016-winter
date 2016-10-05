package javahw;

public class JavaHW {

    static double evalPi(int n) {
        int z = 0;
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y < 1) {
                z++;
            }
        }
        return 4.0 * z/n;
    }

    static long fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("argument must be non negatgive");
        }
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 1000000;
        long start = System.currentTimeMillis();
        double pi = evalPi(n);
        System.out.println("Total time: " + (System.currentTimeMillis() - start));
        System.out.println("result pi for " + n + " points is " + pi);
//        int n = 10;
//        if (args.length > 0) {
//            n = Integer.parseInt(args[0]);
//        }
//        System.out.println(fact(-1));

    }

}
