package atividade_classes.exercicios_classes3;

public class fazenda {
    private double altura;
    private double largura;
    private int metro;
    
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double getAltura(){
        return altura;
    }

    public void setmetro(int valor){
        this.metro = valor;
    }

    public int getmetro(){
        return metro;
    }

    public double getLargura(){
        return largura;
    }

    public double area(){
        return this.altura * this.largura;
    }

    public double calcularValorLote(){
        return this.altura*this.largura*this.metro;
    }
}
