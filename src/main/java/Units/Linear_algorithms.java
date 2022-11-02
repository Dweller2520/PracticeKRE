package Units;

import java.util.Scanner;

public class Linear_algorithms {
    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        System.out.print("Input radius: ");
        double input = input();
        double square = Math.PI * Math.pow(input, 2);
        double perimeter = 2 * Math.PI * input;
        System.out.println("S = " + square + "\n" + "P = " + perimeter);
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

