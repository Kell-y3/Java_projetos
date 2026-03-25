package atividade_retangulo;
import java.awt.Rectangle;
import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Rectangle f1 = new Rectangle(0,0,500,400);
        Rectangle f2 = new Rectangle(500,0,800,400);
        Rectangle f3 = new Rectangle(1300,0,400,400);
        Rectangle f4 = new Rectangle(0,400,1700,200);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a coordernada X: ");
        int cooX = entrada.nextInt();
        System.out.println("Digite a coordernada Y: ");
        int cooY = entrada.nextInt();

        boolean filho1 = f1.contains(cooX, cooY);
        boolean filho2 = f2.contains(cooX, cooY);
        boolean filho3 = f3.contains(cooX, cooY);
        boolean filho4 = f4.contains(cooX, cooY);
        
        System.out.println("Filho 1: " + filho1);

        System.out.println("Filho 2: " + filho2);

        System.out.println("Filho 3: " + filho3);

        System.out.println("Filho 4: " + filho4);

        entrada.close();
    }
}