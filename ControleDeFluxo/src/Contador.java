import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int n2 = scanner.nextInt();

        try {
            Validador(n1, n2);
        } catch (ParametrosInvalidosException e) {
            System.out.print("\nO parâmetro 2 precisar ser maior que o primeiro!");
        }
    }

    static void Validador(int x, int y) throws ParametrosInvalidosException {
        if (x > y) {
            throw new ParametrosInvalidosException();
        } else {
            int contador = y - x;
            for (int i = 1; i <= contador; i++) {
                System.out.printf("\nImprimindo o número %d", i);
            }
        }
    }
}
