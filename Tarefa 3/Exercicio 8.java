import java.util.Scanner;

public class MaiorMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Digite cinco números inteiros:");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();
        int numero5 = scanner.nextInt();

        scanner.close();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        if (numero1 > maior) {
            maior = numero1;
        }
        if (numero1 < menor) {
            menor = numero1;
        }

        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        if (numero4 > maior) {
            maior = numero4;
        }
        if (numero4 < menor) {
            menor = numero4;
        }

        if (numero5 > maior) {
            maior = numero5;
        }
        if (numero5 < menor) {
            menor = numero5;
        }

  
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}
