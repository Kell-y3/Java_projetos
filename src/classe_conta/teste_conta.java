package classe_conta;

public class teste_conta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("Pink", 33);

        minhaConta.depositar(100);
        minhaConta.sacar(30);

        System.out.println("Titular: " + minhaConta.getTitular());
        System.out.println("Número da Conta: " + minhaConta.getNumeroConta());
        System.out.println("Saldo: " + minhaConta.getSaldo());
    }
}
