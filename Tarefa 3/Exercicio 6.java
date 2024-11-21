import java.util.Scanner;

public class OrdenaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Digite os valores de A, B e C:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        scanner.close();

        double menor, meio, maior;

        if (A <= B && A <= C) {
            menor = A;
            meio = (B <= C) ? B : C;
            maior = (B > C) ? B : C;
        } else if (B <= A && B <= C) {
            menor = B;
            meio = (A <= C) ? A : C;
            maior = (A > C) ? A : C;
        } else {
            menor = C;
            meio = (A <= B) ? A : B;
            maior = (A > B) ? A : B;
        }

  
        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
