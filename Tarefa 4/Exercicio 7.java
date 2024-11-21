import java.util.Scanner;

public class QuadradoSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        scanner.close();

        double soma = A + B + C;

        double quadradoSoma = Math.pow(soma, 2);

        System.out.println("O quadrado da soma de A, B e C é: " + quadradoSoma);
    }
}
