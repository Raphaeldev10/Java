import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String nome = scanner.nextLine();

        System.out.println("Digite seu sexo (M para masculino, F para feminino):");
        
        char sexo = scanner.next().charAt(0);

    
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
        }

   
        scanner.close();
    }
}
