public class Main {
    public static void main(String[] args) {
      
        int celsiusInicial = 10;
        int celsiusFinal = 100;
        
        System.out.println("Conversão de graus Celsius para Fahrenheit:");
        System.out.println("Celsius\t Fahrenheit");
        
      
        for (int celsius = celsiusInicial; celsius <= celsiusFinal; celsius += 10) {
          
            double fahrenheit = (9.0 * celsius + 160) / 5;
           
            System.out.println(celsius + "\t " + fahrenheit);
        }
    }
}
