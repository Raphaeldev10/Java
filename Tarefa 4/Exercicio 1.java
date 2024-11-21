import java.util.Scanner;

public class PropriedadeDistributiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite o primeiro número inteiro (A): ");
        int A = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (B): ");
        int B = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro (C): ");
        int C = scanner.nextInt();

        System.out.print("Digite o quarto número inteiro (D): ");
        int D = scanner.nextInt();

      
        System.out.println("Resultados das adições:");
        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));

        System.out.println("\nResultados das multiplicações:");
        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));

        scanner.close();
    }
}
