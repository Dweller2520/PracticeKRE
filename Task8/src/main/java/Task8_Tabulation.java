import java.text.DecimalFormat;

public class Task8_Tabulation {
    static DecimalFormat format = new DecimalFormat("#0.00");
    static double x, y, i, sumY;
    static double f9 = Math.cos(Math.pow(x, 2) + 1) - Math.abs(Math.pow(Math.sin(x), 2) - 5.76);

    public static void main(String[] args) {
        calc();
        System.out.println("\n" + "sum Y min-max = " + format.format(sumY));
    }

    public static void calc() {
        y = 0;
        i = 0.1;
        for (; i <= 1; i += 0.1) {
            y += f9;
            System.out.println("x = " + format.format(i) + " " +
                    "y = " + format.format(y));
        }
        sumY = f9 + y;
    }
}
