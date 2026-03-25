package atividade_retangulo;
import java.time.LocalDate;

public class questao5 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2026,02,18);
        LocalDate novaData = data.plusDays(25);
        int dia = novaData.getDayOfMonth();
        int mes = novaData.getMonthValue();
        int ano = novaData.getYear();

        System.out.println("Data da prova: "+dia+"/"+mes+"/"+ano);
        
    }    
}
