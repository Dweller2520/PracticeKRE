import java.text.DecimalFormat;

public class Task3b_Desalting {
    static DecimalFormat format = new DecimalFormat("#0.00");
    static double x, A, B, C, A_tax, B_tax, C_tax, A_issuance, B_issuance, C_issuance;
    static double f3 = Math.abs(Math.cos(x) / 2.7) + 9.1 * Math.sin(1.2 * x + 1);
    static double f4 = Math.abs(Math.sin(x) / 3.12 + Math.pow(Math.cos(x), 2)) - 8.3 * Math.sin(3 * x);
    static double f5 = Math.cos(Math.abs(2 * x)) / 1.12 - Math.cos(3 * x - 2) + 6.15;

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        A = 100 * Math.abs(f3 * 3 + 50);
        B = 150 * Math.abs(f4 * 4 + 100);
        C = 200 * Math.abs(f5 * 5 + 135);

        A_tax = (A * 10) / 100;
        B_tax = (B * 15) / 100;
        C_tax = (C * 20) / 100;

        A_issuance = A - A_tax;
        B_issuance = B - B_tax;
        C_issuance = C - C_tax;

        System.out.println("Для робіт типу А сумма: " + format.format(A) + "\n" + "Податок складає 10%: " + format.format(A_tax) + "\n" + "Cума до видачі: " + format.format(A_issuance) + "\n");
        System.out.println("Для робіт типу В: " + format.format(B) + "\n" + "Податок складає 15%: " + format.format(B_tax) + "\n" + "Cума до видачі: " + format.format(B_issuance) + "\n");
        System.out.println("Для робіт типу C: " + format.format(C) + "\n" + "Податок складає 20%: " + format.format(C_tax) + "\n" + "Cума до видачі: " + format.format(C_issuance) + "\n");
    }
}
