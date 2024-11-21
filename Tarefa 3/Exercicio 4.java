import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.println("Digite as quatro notas do aluno:");
        float nota1 = scanner.nextfloat();
        float nota2 = scanner.nextfloat();
        float nota3 = scanner.nextfloat();
        float nota4 = scanner.nextfloat();
        
        
       float media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        
      
        if (media >= 7.0) {
            System.out.println("O aluno foi aprovado com média " + media);
        } else {
            System.out.println("O aluno foi para o exame.");
            System.out.print("Digite a nota do exame: ");
           float notaExame = scanner.nextDouble();
            
         
           float novaMedia = (media + notaExame) / 2.0;
            
           
            if (novaMedia >= 5.0) {
                System.out.println("O aluno foi aprovado em exame com média " + novaMedia);
            } else {
                System.out.println("O aluno foi reprovado com média " + novaMedia);
            }
        }
        
        scanner.close();
    }
}
