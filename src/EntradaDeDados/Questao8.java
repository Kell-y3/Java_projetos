package EntradaDeDados;
import java.util.Scanner;

public class Questao8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua distância: ");
            double distancia = scanner.nextDouble();
            System.out.println("Digite sua velocidade: ");
            double velocidade = scanner.nextDouble();
            
            double tempo = (distancia / velocidade);
            int horas = (int) tempo;
            double minutos = (tempo - horas) * 60;
            int minuto = (int) minutos;
            int segundos = (int) ((minutos - minuto) * 60);
            System.out.println("Tempo: " + horas + "hr " + minuto + "min " + segundos + "s");

            scanner.close();

        }
    
}
