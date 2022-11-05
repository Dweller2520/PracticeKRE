import java.util.Scanner;

public class Task4_1_Choice_ArrayList {
    public static String[] stud = {
            "1. Болдирев", "2. Бриль", "3. Ващук", "4. Горленко", "5. Григоренко", "6. Діденко", "7. Дима", "8. Донченко",
            "9. Дубина", "10. Дудник", "11. Жигалов", "12. Кравченко", "13. Куриленко", "14. Левенець", "15. Підгорний",
            "16. Паламарчук", "17. Полоник", "18. Сидоренко", "19. Тараненко", "20. Шевченко Д.", "21. Шевченко К.",
            "22. Шмалько", "23. Ярошик"
    };

    public static void main(String[] args) {
        for (String s : stud) {
            System.out.println(s);
        }
        out();
    }

    static void out() {
        System.out.print("\n\nEnter number of student: ");
        double input = input();
        if (input > stud.length | input == 0) {
            System.out.println("Input the correctly number\n");
        } else {
            System.out.println("\n" + stud[(int) input - 1]);
        }
        out();
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
