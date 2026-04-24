package atividade_classes.exercicios_classes2;
import java.util.Scanner;

public class testeretangulo {
    public static void main(String[] args) {
        retangulo unicoRetangulo = new retangulo();
        Scanner entrada = new Scanner(System.in);
        double altura;
        double largura;

        System.out.println("Digite a altura: ");
        unicoRetangulo.setAltura(entrada.nextDouble());
        altura = unicoRetangulo.getAltura();

        System.out.println("Digite a largura: ");
        unicoRetangulo.setLargura(entrada.nextDouble());
        largura = unicoRetangulo.getLargura();

        double area = unicoRetangulo.area();

        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Area: " +area);

        entrada.close();
    }
}
