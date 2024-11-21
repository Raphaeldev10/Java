import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        int horasTrabalhadas = scanner.nextInt();
        
        
        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
       
        int jornadaSemanal = 40;
        int semanasPorMes = 4;
        
     
        double salarioTotal;
        if (horasTrabalhadas <= jornadaSemanal * semanasPorMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - (jornadaSemanal * semanasPorMes);
            salarioTotal = (jornadaSemanal * semanasPorMes * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
        }
        
      
        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
        
      
        scanner.close();
    }
}
