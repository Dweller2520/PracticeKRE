import java.text.DecimalFormat;

public class Task7a {
    static DecimalFormat format = new DecimalFormat("#0.00");
    static double x, y;
    static int k;
    static double f8 = Math.cos(Math.pow(x, 2)) * Math.sin(2 * x - 1) + 4.29;

    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        y = 0;
        k = 1;
        while (y < 1) {
            k++;
            y -= (f8 * k) / k;
            System.out.println("y = " + format.format(y));
        }
    }
}
