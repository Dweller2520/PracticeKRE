import java.text.DecimalFormat;

public class Task9_One_dimensional_arrays {
    static DecimalFormat format = new DecimalFormat("#0.00");
    static double[] elements = new double[12];
    static double x;
    static double y = 0;
    static double maxNumber = y;
    static double f9 = Math.cos(Math.pow(x, 2) + 1) - Math.abs(Math.sin(2 * x) - 5.76);
    static double Y_sum = 0;

    public static void main(String[] args) {
        CountYears();
        MaxElement();
        out();
    }

    public static void CountYears() {
        int i = 0;
        for (int k = 1991; k <= 2001; k++) {
            i++;
            elements[i] = y += 100 * f9 * k;
            System.out.println(k + " рік = " + format.format(elements[i]));
        }
    }

    public static void MaxElement() {
        for (int i = 0; i < elements.length; i++) {
            if (maxNumber <= elements[i]) {
                maxNumber = elements[i];
            }
        }
    }

    public static void out() {
        if (y >= 0)
            Y_sum += y;
        else {
            System.out.println("Компанія не мала прибутків");
        }
        System.out.println("Максимальний збиток: " + format.format(maxNumber));
    }
}
