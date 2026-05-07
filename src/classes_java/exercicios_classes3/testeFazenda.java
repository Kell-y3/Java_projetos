package atividade_classes.exercicios_classes3;
import java.util.Scanner;

public class testeFazenda {
 public static void main(String[] args) {
        fazenda meuRetangulo = new fazenda();
        Scanner entrada = new Scanner(System.in);
        double altura;
        double largura;

        System.out.println("Digite a altura: ");
        meuRetangulo.setAltura(entrada.nextDouble());
        altura = meuRetangulo.getAltura();

        System.out.println("Digite a largura: ");
        meuRetangulo.setLargura(entrada.nextDouble());
        largura = meuRetangulo.getLargura();

        System.out.println("Digite o valor do m²: ");
        meuRetangulo.setmetro(entrada.nextInt());
        int metro = meuRetangulo.getmetro();

        double area = meuRetangulo.area();
        double valor = meuRetangulo.calcularValorLote();

        System.out.println("\nRetângulo");
        System.out.println("Altura = "+altura+" metro");
        System.out.println("Largura = "+largura+" metro");
        System.out.println("Area = "+area+" m²");
        System.out.println("Valor total = "+valor+" R$");

        entrada.close();
    }}
