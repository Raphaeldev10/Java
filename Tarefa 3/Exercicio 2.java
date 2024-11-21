import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int numero = scanner.nextInt();


        scanner.close();


        int valorAbsoluto = Math.abs(numero);

        System.out.println("O valor absoluto do número é: " + valorAbsoluto);
    }
}
