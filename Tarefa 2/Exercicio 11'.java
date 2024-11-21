import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();
        
     
        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();
        
      
        System.out.print("Digite o débito do cliente: ");
        double debito = scanner.nextDouble();
        
    
        System.out.print("Digite o crédito do cliente: ");
        double credito = scanner.nextDouble();
        
     
        double saldoAtual = saldo - debito + credito;
        
   
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        
       
        scanner.close();
    }
}
