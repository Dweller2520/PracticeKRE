package Units;

import java.text.DecimalFormat;

public class One_dimensional_arrays {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);
        double y = 0;
        for (int i = 0; i <= 11; i++) {
            y += f;
        }
    }
}
