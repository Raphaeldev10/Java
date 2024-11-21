public class Main {
    public static void main(String[] args) {
        System.out.println("Resultados das potências de 3, variando do expoente 0 até o expoente 15:");
        
        int base = 3;
        long potencia = 1; 
        
        for (int expoente = 0; expoente <= 15; expoente++) {
            System.out.println(base + " elevado a " + expoente + " é igual a " + potencia);
            
           
            potencia *= base;
        }
    }
}
