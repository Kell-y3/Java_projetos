package testes;

import javax.swing.JOptionPane;

public class teste2 {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite seu salário: ");
        double salario = Double.valueOf(entrada);
        JOptionPane.showMessageDialog(null,"Você pagará de imposto: " + salario * 0.1 + " R$");
    }
}
