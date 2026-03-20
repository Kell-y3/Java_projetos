import java.util.Scanner;

public class Questao1 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a altura do triângulo: ");
            double altura = scanner.nextDouble();
            
            System.out.println("Digite a base do triângulo: ");
            double base = scanner.nextDouble();

            double area = (altura*base) /2;
            System.out.println("Sua área é: " + area);

            scanner.close();

            
        }
    }
    
