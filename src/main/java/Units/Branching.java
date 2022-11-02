package Units;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Branching {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        count();
    }

    static void count() {
        double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);
        System.out.println("f = " + f);

        System.out.println("fn(φ), При |Y| < 10");
        System.out.println("fn(ω), При |Y| >= 10");
        System.out.print("Enter char Y: ");
        double y = input();
        if (Math.abs(y) < 10) {
            System.out.print("|X| < 10, Enter char a: ");
            double a = input();
            System.out.print("|X| < 10, Enter char b: ");
            double b = input();
            double h = Math.tan(y + a) - Math.log(Math.abs(b + 7));
            System.out.println("φ = " + format.format(h));
        } else if (Math.abs(y) >= 10) {
            System.out.print("|X| >= 10, enter char c: ");
            double c = input();
            System.out.print("|X| >= 10, enter char d: ");
            double d = input();
            double b = Math.pow(c, 5) * Math.sqrt(Math.pow(y, 2) + d * Math.pow(Math.E, 1.3));
            System.out.println("ω = " + format.format(b));
        }
    }

    static double input() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception ex) {
            System.out.println("Input correct number");
            return input();
        }
    }
}
