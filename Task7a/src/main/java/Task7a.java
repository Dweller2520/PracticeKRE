import java.text.DecimalFormat;

public class Task7a {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);
        double y = 0;
        int k = 1;
        while (y < 1) {
            k++;
            y -= (f * k) / k;
            System.out.println("y = " + format.format(y));
        }
    }
}
