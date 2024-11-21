import java.util.Scanner;

public class EleicaoSindical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Digite a quantidade de votos válidos para o candidato A: ");
        int votosA = scanner.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato B: ");
        int votosB = scanner.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato C: ");
        int votosC = scanner.nextInt();

     
        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite a quantidade de votos em branco: ");
        int votosBranco = scanner.nextInt();

     
        scanner.close();

      
        int totalEleitores = votosA + votosB + votosC + votosNulos + votosBranco;

   
        double percentualVotosA = (double) votosA / totalEleitores * 100;
        double percentualVotosB = (double) votosB / totalEleitores * 100;
        double percentualVotosC = (double) votosC / totalEleitores * 100;
        double percentualVotosNulos = (double) votosNulos / totalEleitores * 100;
        double percentualVotosBranco = (double) votosBranco / totalEleitores * 100;

   
        System.out.println("Número total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos válidos: " + (100 - percentualVotosNulos - percentualVotosBranco) + "%");
        System.out.println("Percentual de votos válidos do candidato A: " + percentualVotosA + "%");
        System.out.println("Percentual de votos válidos do candidato B: " + percentualVotosB + "%");
        System.out.println("Percentual de votos válidos do candidato C: " + percentualVotosC + "%");
        System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
        System.out.println("Percentual de votos em branco: " + percentualVotosBranco + "%");
    }
}
