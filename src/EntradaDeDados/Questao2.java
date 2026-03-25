package EntradaDeDados;
import java.util.Scanner;

public class Questao2 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a altura do retângulo: ");
            double altura = scanner.nextDouble();
            
            System.out.println("Digite a largura do retângulo: ");
            double largura = scanner.nextDouble();

            double area = (altura*largura);
            double perimetro = (2*altura) + (2*largura);
            System.out.println("Sua área é: " + area);
            System.out.println("Seu perimetro é: " + perimetro);

            scanner.close();

            
        }
    }
    

