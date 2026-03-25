package classe_retangulo;
import java.awt.Rectangle;

public class teste2 {
    public static void main(String[] args) {
        Rectangle f1 = new Rectangle(0,0,400,500);
        Rectangle f2 = new Rectangle(400,0,700,500);
        Rectangle f3 = new Rectangle(1100,0,500,500);
        Rectangle f4 = new Rectangle(0,500,1600,100);

        int pocoX = 450;
        int pocoY = 550;

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