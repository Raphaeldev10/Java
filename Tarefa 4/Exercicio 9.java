import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o salário mensal: ");
        double SM = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste: ");
        double PR = scanner.nextDouble();


        scanner.close();

    
        double NS = SM * (1 + PR / 100);


        System.out.println("O novo salário é: R$" + NS);
    }
}
