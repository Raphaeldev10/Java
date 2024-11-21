import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite as quatro notas do aluno:");
        float nota1 = scanner.nextfloat();
        float nota2 = scanner.nextfloat();
        float nota3 = scanner.nextfloat();
        float nota4 = scanner.nextfloat();
  
       float media = (nota1 + nota2 + nota3 + nota4) / 4;

   
        if (media >= 5) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("O aluno não foi aprovado com média " + media);
        }

   
        scanner.close();
    }
}
