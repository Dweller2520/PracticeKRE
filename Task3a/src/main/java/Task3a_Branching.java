import java.text.DecimalFormat;
import java.util.Scanner;

public class Task3a_Branching {
    static DecimalFormat format = new DecimalFormat("#0.00");
    static double x, y, a, b, h;
    static double f3 = Math.abs(Math.cos(x) / 2.7) + 9.1 * Math.sin(1.2 * x + 1);
    static double f4 = Math.abs(Math.sin(x) / 3.12 + Math.pow(Math.cos(x), 2)) - 8.3 * Math.sin(3 * x);

    public static void main(String[] args) {
        count();
    }

    static void count() {
        System.out.println("f3 = " + format.format(f3));
        System.out.println("f4 = " + format.format(f4));

        System.out.println("fn(φ), При |Y| < 10");
        System.out.println("fn(ω), При |Y| >= 10");
        System.out.print("Enter char Y: ");
        y = input();
        if (Math.abs(y) < 10) {
            System.out.print("|X| < 10, Enter char a: ");
            a = input();
            System.out.print("|X| < 10, Enter char b: ");
            b = input();
            h = (Math.tan(y + a) - Math.log(Math.abs(b + 7))) * f3;
            System.out.println("φ = " + format.format(h));
        } else if (Math.abs(y) >= 10) {
            System.out.print("|X| >= 10, enter char c: ");
            a = input();
            System.out.print("|X| >= 10, enter char d: ");
            b = input();
            h = (Math.pow(a, 5) * Math.sqrt(Math.pow(y, 2) + b * Math.pow(Math.E, 1.3))) * f4;
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
