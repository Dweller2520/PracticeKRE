package Units;

import java.util.Scanner;

public class Task4_2_Choice_case_if {
    public static void main(String[] args) {
        getStudents();
    }

    static void getStudents() {
        System.out.print("Enter student number: ");
        int input = (input());
        switch (input) {
            case 1 -> System.out.println("case: " + "Болдирев");
            case 2 -> System.out.println("case: " + "Бриль");
            case 3 -> System.out.println("case: " + "Ващук");
            case 4 -> System.out.println("case: " + "Горленко");
            case 5 -> System.out.println("case: " + "Григоренко");
            case 6 -> System.out.println("case: " + "Діденко");
            case 7 -> System.out.println("case: " + "Дима");
            case 8 -> System.out.println("case: " + "Донченко");
            case 9 -> System.out.println("case: " + "Дубина");
            case 10 -> System.out.println("case: " + "Дудник");
            case 11 -> System.out.println("case: " + "Жигалов");
            case 12 -> System.out.println("case: " + "Кравченко");
            case 13 -> System.out.println("case: " + "Куриленко");
            case 14 -> System.out.println("case: " + "Левенець");
            case 15 -> System.out.println("case: " + "Підгорний");
            case 16 -> System.out.println("case: " + "Паламарчук");
            case 17 -> System.out.println("case: " + "Полоник");
            case 18 -> System.out.println("case: " + "Сидоренко");
            case 19 -> System.out.println("case: " + "Тараненко");
            case 20 -> System.out.println("case: " + "Шевченко Д.");
            case 21 -> System.out.println("case: " + "Шевченко К.");
            case 22 -> System.out.println("case: " + "Шмалько");
            case 23 -> System.out.println("case: " + "Ярошик");
        }
        if (input == 1) System.out.println("if: " + "Болдирев" + "\n");
        if (input == 2) System.out.println("if: " + "Бриль" + "\n");
        if (input == 3) System.out.println("if: " + "Ващук" + "\n");
        if (input == 4) System.out.println("if: " + "Горленко" + "\n");
        if (input == 5) System.out.println("if: " + "Григоренко" + "\n");
        if (input == 6) System.out.println("if: " + "Діденко" + "\n");
        if (input == 7) System.out.println("if: " + "Дима" + "\n");
        if (input == 8) System.out.println("if: " + "Донченко" + "\n");
        if (input == 9) System.out.println("if: " + "Дубина" + "\n");
        if (input == 10) System.out.println("if: " + "Дудник" + "\n");
        if (input == 11) System.out.println("if: " + "Жигалов" + "\n");
        if (input == 12) System.out.println("if: " + "Кравченко" + "\n");
        if (input == 13) System.out.println("if: " + "Куриленко" + "\n");
        if (input == 14) System.out.println("if: " + "Левенець" + "\n");
        if (input == 15) System.out.println("if: " + "Підгорний" + "\n");
        if (input == 16) System.out.println("if: " + "Паламарчук" + "\n");
        if (input == 17) System.out.println("if: " + "Полоник" + "\n");
        if (input == 18) System.out.println("if: " + "Сидоренко" + "\n");
        if (input == 19) System.out.println("if: " + "Тараненко" + "\n");
        if (input == 20) System.out.println("if: " + "Шевченко Д." + "\n");
        if (input == 21) System.out.println("if: " + "Шевченко К." + "\n");
        if (input == 22) System.out.println("if: " + "Шмалько" + "\n");
        if (input == 23) System.out.println("if: " + "Ярошик" + "\n");
        getStudents();
    }

    static int input() {
        Scanner scanner = new Scanner(System.in);
        try {
            return (Integer.parseInt(scanner.nextLine()));
        } catch (Exception ex) {
            System.out.println("Input correct number");
            return input();
        }
    }
}
