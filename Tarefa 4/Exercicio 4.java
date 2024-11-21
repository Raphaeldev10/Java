import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();


        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();

   
        scanner.close();

      
        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor em reais é: R$" + valorEmReais);
    }
}
