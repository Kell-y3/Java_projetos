package atividade_classes.testes;

public class testeConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setTitular("Fulano");
        minhaConta.depositar(1000);
        minhaConta.sacar(30);

        System.out.println("Conta:" +minhaConta.getTitular());
        System.out.println("Saldo:" +minhaConta.getSaldo());
    }
    
}
