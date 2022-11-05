import java.text.DecimalFormat;

public class Task9_One_dimensional_arrays {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);
        double y = 0;
        double Y_sum = 0;
        for (int k = 1991; k <= 2001; k++) {
            y += 100 * f * k;
            Y_sum += y;
            System.out.println(k + " рік = " + format.format(y));
        }
        System.out.println("Сумма прибутків = " + format.format(Y_sum));
    }
}
