package EntradaDeDados;
import java.util.Scanner;

public class Questao5 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu salário: ");
            double salario = scanner.nextDouble();
            
            double salariobase = (salario);
            double imposto = (salariobase * 0.10);
            System.out.println("Salário: " + salario);
            System.out.println("Imposto: " + imposto);

            scanner.close();

            
        }    
}
