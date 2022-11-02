package Units;

import java.text.DecimalFormat;

public class Task8_Tabulation {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);
        double y = 0;
        double i = 0.1;

        for (; i <= 1; i += 0.1) {
            y += f;

            System.out.println("x = " + format.format(i) + " " +
                    "y = " + format.format(y));
        }
        double sumY = f + y;
        System.out.println("\n" + "sum Y min-max = " + format.format(sumY));
    }
}
