public class Main {
    public static void main(String[] args) {
        int n = 15; 
        
        System.out.println("Série de Fibonacci até o décimo quinto termo:");
        
        int primeiroTermo = 1;
        int segundoTermo = 1;
        
     
        System.out.print(primeiroTermo + ", " + segundoTermo);
        
        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);
            
           
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        
        System.out.println();
    }
}
