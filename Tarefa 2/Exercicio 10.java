import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        
        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
        double valorVendas = scanner.nextDouble();
        
     
        double limiteComissao = 1500.00;
        
     
        double comissao;
        if (valorVendas <= limiteComissao) {
            comissao = valorVendas * 0.03; 
        } else {
            comissao = limiteComissao * 0.03 + (valorVendas - limiteComissao)
        }
        
    
        double salarioTotal = salarioFixo + comissao;
        
    
        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
        
    
        scanner.close();
    }
}
