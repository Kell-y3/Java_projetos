package atividade_classes.exercicos_classes1;

public class retangulo {
    private double altura;
    private double largura;
    
    public void setAltura(double a){
        this.altura = a;
    }

    public void setLargura(double l){
        this.largura = l;
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public double area(){
        return this.altura * this.largura;
    }
}
