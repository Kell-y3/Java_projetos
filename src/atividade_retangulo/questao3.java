package atividade_retangulo;
import java.awt.Rectangle;

public class questao3 {
    public static void main(String[] args) {
        Rectangle f1 = new Rectangle(0,0,400,400);
        Rectangle f2 = new Rectangle(400,0,900,400);
        Rectangle f3 = new Rectangle(1300,0,400,400);
        Rectangle f4 = new Rectangle(0,400,1700,200);

        Rectangle mina = new Rectangle (350, 100, 100, 120);
        boolean filho1 = f1.intersects(mina);
        boolean filho2 = f2.intersects(mina);
        boolean filho3 = f3.intersects(mina);
        boolean filho4 = f4.intersects(mina);
        
        System.out.println("Filho 1: " + filho1);

        System.out.println("Filho 2: " + filho2);

        System.out.println("Filho 3: " + filho3);

        System.out.println("Filho 4: " + filho4);
    }
}