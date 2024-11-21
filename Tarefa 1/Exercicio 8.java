import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();
        
       
        double resultado = Math.pow(base, expoente);
        
    
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é igual a " + resultado);
        
        scanner.close();
    }
}
