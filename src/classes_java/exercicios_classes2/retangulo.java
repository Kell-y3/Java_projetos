package atividade_classes.;

public class retangulo {
    private double altura;
    private double largura;
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
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
