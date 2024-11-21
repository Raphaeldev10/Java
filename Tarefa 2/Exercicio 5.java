import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        
      
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        
      
        int idade = anoAtual - anoNascimento;
        
     
        String mensagem;
        if (idade >= 16) {
            mensagem = "Poderá votar este ano.";
        } else {
            mensagem = "Não poderá votar este ano.";
        }
        
        System.out.println(mensagem);
        
       
        scanner.close();
    }
}
