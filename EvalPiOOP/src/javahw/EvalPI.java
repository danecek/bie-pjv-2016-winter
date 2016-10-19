package javahw;

public class EvalPI {

    static double evalPi(int n) {
        int z = 0;
        for (int i = 0; i < n; i++) {
            if (new Point().isInCircle(1)) {
                z++;
            }
        }
        return 4.0 * z / n;
    }

    public static void main(String[] args) {
        int n = 1000000;
        long start = System.currentTimeMillis();
        double pi = evalPi(n);
        System.out.println("Total time: " + (System.currentTimeMillis() - start) + " ms");
        System.out.println("result pi for " + n + " points is " + pi);
//        int n = 10;
//        if (args.length > 0) {
//            n = Integer.parseInt(args[0]);
//        }
//        System.out.println(fact(-1));

    }

}
