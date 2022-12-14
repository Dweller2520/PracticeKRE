import java.text.DecimalFormat;

public class Task2_About_the_triangle {
    static DecimalFormat format = new DecimalFormat("#0.00");
    static double A, B, C, p, hA, Lc, cosA;

    public static void main(String[] args) {
        triangle();

        System.out.println("Сторона BC = " + format.format(A));
        System.out.println("Сторона AC = " + format.format(B));
        System.out.println("Сторона AB = " + format.format(C) + "\n");

        System.out.println("Полупериметер трикутника = " + format.format(p));
        System.out.println("Висота до сторони А = " + format.format(hA));
        System.out.println("Бісектриса до сторони С = " + format.format(Lc));

        System.out.println("Кут А = " + format.format(cosA));
    }

    public static void triangle() {
        A = Math.sqrt(Math.pow(-2, 2) + Math.pow(2, 2));
        B = Math.sqrt(Math.pow(1, 2) + Math.pow(-2, 2));
        C = Math.sqrt(Math.pow(1, 2) + Math.pow(0, 2));

        p = (A + B + C) / 2;
        hA = (2 / A) * (Math.sqrt(p * (p - A) * (p - B) * (p - C)));
        Lc = (2 * Math.sqrt(A * B * p * (p - C))) / (A + B);

        cosA = B / C;
    }
}
//Трикутник заданий координатами вершин А(0; 0), B(1;0) і C(-1; 2), де i - номер варіанта.
//Обчислити висоту hA і бісектрису Lc
