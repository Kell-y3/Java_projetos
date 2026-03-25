package EntradaDeDados;
import java.util.Scanner;

public class Questao4 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a temperatura: ");
            double celsius = scanner.nextDouble();
            
            double fahrenheit = (celsius * 1.8) + 32;
            double kelvin = (fahrenheit + 459.67) / 1.8;
            System.out.println("Celsius: " + celsius);
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);

            scanner.close();

            
        }
    }
    
