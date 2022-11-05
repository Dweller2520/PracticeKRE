import java.text.DecimalFormat;

public class Task3b_Desalting {
    static DecimalFormat format = new DecimalFormat("#0.00");

    public static void main(String[] args) {
        calculate();
    }

    static void calculate() {
        double f = 9.2 * Math.pow(Math.cos(1), 2) - Math.abs(Math.sin(1) / 1.1);
        double A = 100 * Math.abs(f * 3 + 50);
        double B = 150 * Math.abs(f * 4 + 100);
        double C = 200 * Math.abs(f * 5 + 135);

        double A_tax = (A * 10) / 100;
        double B_tax = (B * 15) / 100;
        double C_tax = (C * 20) / 100;

        double A_issuance = A - A_tax;
        double B_issuance = B - B_tax;
        double C_issuance = C - C_tax;

        System.out.println("Для робіт типу А сумма: " + format.format(A) + "\n" + "Податок складає 10%: " + format.format(A_tax) + "\n" + "Cума до видачі: " + format.format(A_issuance) + "\n");
        System.out.println("Для робіт типу В: " + format.format(B) + "\n" + "Податок складає 15%: " + format.format(B_tax) + "\n" + "Cума до видачі: " + format.format(B_issuance) + "\n");
        System.out.println("Для робіт типу C: " + format.format(C) + "\n" + "Податок складає 20%: " + format.format(C_tax) + "\n" + "Cума до видачі: " + format.format(C_issuance) + "\n");
    }
}
