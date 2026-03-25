package atividade_retangulo;
import java.time.LocalDate;

public class questao6 {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2025,04,12);
        LocalDate novaData1 = data1.plusDays(20);
        int dia1 = novaData1.getDayOfMonth();
        int mes1 = novaData1.getMonthValue();
        int ano1 = novaData1.getYear();

        LocalDate data2 = LocalDate.of(2025,04,12);
        LocalDate novaData2 = data2.plusDays(40);
        int dia2 = novaData2.getDayOfMonth();
        int mes2 = novaData2.getMonthValue();
        int ano2 = novaData2.getYear();

        LocalDate data3 = LocalDate.of(2025,04,12);
        LocalDate novaData3 = data3.plusDays(75);
        int dia3 = novaData3.getDayOfMonth();
        int mes3 = novaData3.getMonthValue();
        int ano3 = novaData3.getYear();


        System.out.println("Prova 1: "+dia1+"/"+mes1+"/"+ano1);
        System.out.println("Prova 2: "+dia2+"/"+mes2+"/"+ano2);
        System.out.println("Prova 3: "+dia3+"/"+mes3+"/"+ano3);
        
    }    
}
