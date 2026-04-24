package classe_conta;

public class Conta {
    private String titular;
    private int numeroConta;
    private double saldo;

    public Conta(String nome, int numero) {
        titular = nome;
        numeroConta = numero;
        saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String nome) {
        this.titular = nome;
    }

    public String getTitular() {
        return titular;
    }
}
