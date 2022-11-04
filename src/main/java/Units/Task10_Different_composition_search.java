package Units;

import java.text.DecimalFormat;

public class Task10_Different_composition_search {
    static double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);
    static DecimalFormat format = new DecimalFormat("#0.00");
    static int n = 8;
    static double[] elements = new double[n];

    public static void main(String[] args) {
        addElements();
    }

    public static void addElements() {
        for (int i = 1; i < n; i++) {
            elements[i] = f * i;
        }
        outElements();
    }

    public static void outElements() {
        for (int i = 1; i < n; i++) {
            if (elements[i] > 0)
                System.out.println(format.format(elements[i]));
        }
    }
}
