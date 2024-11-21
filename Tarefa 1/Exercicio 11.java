public class Main {
    public static void main(String[] args) {
        System.out.println("Fatoriais dos valores ímpares de 1 a 10:");
        
       
        for (int i = 1; i <= 10; i++) {
          
            if (i % 2 != 0) {
                long fatorial = calcularFatorial(i); 
                System.out.println("Fatorial de " + i + ": " + fatorial);
            }
        }
    }
    
 
    public static long calcularFatorial(int n) {
        long fatorial = 1;
       
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
