import java.text.DecimalFormat;

public class Task6_SumAndProduct {
    static DecimalFormat format = new DecimalFormat("#0.00");
    static double x, X, Y;
    static double f6 = Math.sin(x) * Math.cos(Math.pow(x, 2)) * Math.sin(x + 1.4) + 5.14;
    static double f7 = Math.abs(Math.sin(2 * x - 1.5) + 3 * Math.sin(Math.pow(x, 2))) + 2.38;

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        X = 0;
        Y = 1;
        for (int i = 1; i <= 6; i++) {
            X += f6;
            Y *= f7;
        }
        System.out.println("F6(X) = " + format.format(f6) + "\n");
        System.out.println("F7(X) = " + format.format(f7) + "\n");
        System.out.println("X = F1 + F2 + ... + F6 = " + format.format(X));
        System.out.println("Y = F1 * F2 * ... * F6 = " + format.format(Y) + "\n");
        System.out.println("Z = X + Y = " + format.format(X + Y));
    }
}
