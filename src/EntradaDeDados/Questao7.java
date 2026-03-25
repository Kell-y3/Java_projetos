package EntradaDeDados;
import java.util.Scanner;

public class Questao7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua distância: ");
            double distancia = scanner.nextDouble();
            System.out.println("Digite sua velocidade: ");
            double velocidade = scanner.nextDouble();
            
            double tempo = (distancia / velocidade);
            System.out.println("Tempo: " + tempo + " hr");

            scanner.close();

        }
}
