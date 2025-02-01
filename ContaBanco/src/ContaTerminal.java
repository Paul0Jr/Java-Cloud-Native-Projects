import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("\nDigite sua agência: ");
        String agencia = scanner.next();
        System.out.print("\nDigite seu número de conta: ");
        int conta = scanner.nextInt();
        System.out.print("\nDigite seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque!", nome, agencia, conta, saldo);
    }
}
