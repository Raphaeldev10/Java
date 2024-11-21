import java.util.Scanner;

public class QuadradoDiferenca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

      
        int diferencaQuadrado = (A - B) * (A - B);

   
        System.out.println("O quadrado da diferença entre A e B é: " + diferencaQuadrado);

        scanner.close();
    }
}
