import java.util.Scanner;

public class ConversorRealDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();

       
        System.out.print("Digite a quantidade de reais disponíveis: ");
        double quantidadeReais = scanner.nextDouble();

        scanner.close();

      
        double valorEmDolares = quantidadeReais / cotacaoDolar;

        System.out.println("O valor em dólares é: $" + valorEmDolares);
    }
}
