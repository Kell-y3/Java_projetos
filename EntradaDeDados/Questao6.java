import java.util.Scanner;

public class Questao6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu salário: ");
            double salario = scanner.nextDouble();
            
            double salariobase = (salario);
            double imposto = (salariobase * 0.10);
            double salariofinal = (salariobase - imposto);
            System.out.println("Salário: " + salario);
            System.out.println("Imposto: " + imposto);
            System.out.println("Salário final: " + salariofinal);

            scanner.close();
            
        }        
}
