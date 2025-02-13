import java.util.Scanner;

public class Clientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();
        System.out.print(Validador(saldo));
        scanner.close();
    }

    static String Validador(double saldo) {
        String saida = "";
        if (saldo > 500) {
            saida = "Confortavel";
        }
        if (saldo <= 500) {
            saida = "Baixo";
        }
        if (saldo < 0) {
            saida = "Negativado";
        }
        return saida;
    }
}
