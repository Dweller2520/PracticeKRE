package Units;

import java.text.DecimalFormat;

public class Task6_SumAndProduct {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);

        double X = 0;
        double Y = 1;
        for (int i = 1; i <= 6; i++) {
            X += f;
            Y *= f;
        }

        System.out.println("Fn(X) = " + format.format(f) + "\n");
        System.out.println("X = F1 + F2 + ... + Fn = " + format.format(X));
        System.out.println("Y = F1 * F2 * ... * Fn = " + format.format(Y) + "\n");
        System.out.println("Z = X + Y = " + format.format(X + Y));
    }
}
