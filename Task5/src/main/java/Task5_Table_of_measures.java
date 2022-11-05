import java.text.DecimalFormat;
import java.util.Scanner;

public class Task5_Table_of_measures {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        System.out.print("Введите количество циклов: ");
        double input = input();

        int unc = 0;
        double m = 0;
        int carat = 0;

        for (int i = 0; i <= input - 1; i++) {
            unc++;
            m += 28.3534;
            carat += 142;
        }
        System.out.println("Унций: " + unc + "\nМ: " + format.format(m) + "\ncarat: " + carat + "\n\n");
    }

    static int input() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception ex) {
            System.out.println("Input correct number");
            return input();
        }
    }
}
