package atividade_retangulo;
import java.awt.Rectangle;

public class questao1 {
    public static void main(String[] args) {
        Rectangle f1 = new Rectangle(0,0,500,400);
        Rectangle f2 = new Rectangle(500,0,800,400);
        Rectangle f3 = new Rectangle(1300,0,400,400);
        Rectangle f4 = new Rectangle(0,400,1700,200);

        int pocoX = 750;
        int pocoY = 250;

        boolean filho1 = f1.contains(pocoX, pocoY);
        boolean filho2 = f2.contains(pocoX, pocoY);
        boolean filho3 = f3.contains(pocoX, pocoY);
        boolean filho4 = f4.contains(pocoX, pocoY);
        
        System.out.println("Filho 1: " + filho1);

        System.out.println("Filho 2: " + filho2);

        System.out.println("Filho 3: " + filho3);

        System.out.println("Filho 4: " + filho4);
    }
}