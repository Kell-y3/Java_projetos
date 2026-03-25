package classe_retangulo;
import java.awt.Rectangle;

 public class teste1{
    public static void main(String[] args) {
        Rectangle retangulo = new Rectangle(10,10,20,10);
        boolean resposta = retangulo.contains(15,15);
        System.out.println("Sua resposta é: " + resposta);
    }
 }