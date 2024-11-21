import java.util.Scanner;

public class DiferencaMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();

        scanner.close();

        int diferenca;
        if (valor1 > valor2) {
            diferenca = valor1 - valor2;
        } else {
            diferenca = valor2 - valor1;
        }

        System.out.println("A diferença entre o maior e o menor valor é: " + diferenca);
    }
}
