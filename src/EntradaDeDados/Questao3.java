package EntradaDeDados;
import java.util.Scanner;

public class Questao3 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o raio do circulo: ");
            double raio = scanner.nextDouble();
            
            double area = (3.14 * (raio*raio));
            double comprimento = (2 * 3.14 * raio);
            System.out.println("Sua área é: " + area);
            System.out.println("Seu comprimento é: " + comprimento);

            scanner.close();

            
        }
    }
    
