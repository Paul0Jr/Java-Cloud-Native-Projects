import java.util.Scanner;

public class Transacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoInicial = scanner.nextDouble();
        double op1 = scanner.nextDouble();
        double op2 = scanner.nextDouble();
        double op3 = scanner.nextDouble();
        System.out.printf("%.2f\n", Saldo(saldoInicial, op1, op2, op3));
        scanner.close();
    }

    static double Saldo(double saldo, double op1, double op2, double op3) {
        double SaldoFinal;
        double total = op1 + op2 + op3;
        if (total < 0) {
            SaldoFinal = saldo - (total * -1);
        } else {
            SaldoFinal = saldo + total;
        }
        return SaldoFinal;
    }
}