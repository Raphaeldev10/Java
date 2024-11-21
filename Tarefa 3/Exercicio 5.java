import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Digite os valores de A, B e C da equação de segundo grau:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();


        scanner.close();

        if (A == 0) {
            System.out.println("A equação não é de segundo grau, pois A deve ser diferente de zero.");
            return;
        }

        double delta = B * B - 4 * A * C;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
            return;
        }

        
        double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
        double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

        System.out.println("As raízes da equação são:");
        System.out.println("Raiz 1 = " + raiz1);
        System.out.println("Raiz 2 = " + raiz2);
    }
}
