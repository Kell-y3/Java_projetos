package atividade_classes.exercicos_classes1;

public class testeRetangulo {
    public static void main(String[] args) {
        retangulo unicoRetangulo = new retangulo();
        unicoRetangulo.setAltura(20);
        unicoRetangulo.setLargura(40);
        System.out.println(unicoRetangulo.getAltura());
        System.out.println(unicoRetangulo.getLargura());
        System.out.println(unicoRetangulo.area());
    }
}
