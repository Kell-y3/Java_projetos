package atividade_retangulo;
import java.time.LocalDate;
import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        int soma;
        LocalDate data = LocalDate.now();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias: ");
        soma = entrada.nextInt();
        LocalDate novaData = data.plusDays(soma);

        int dia = novaData.getDayOfMonth();
        int mes = novaData.getMonthValue();
        int ano = novaData.getYear();
        

        System.out.println("A data futura é: "+dia+"/"+mes+"/"+ano);
        entrada.close();
        
    }    
}
