/*
1º) Ler um valor e informar se ele é ou não múltiplo de 3
 */
package LP02;

import javax.swing.JOptionPane;

public class LP02_01 {

    public static double lerValor() {
        double vl = 0;
        vl = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor númerico.").replace(",", "."));
        return vl;
    }

    public static String confirmar(double valor) {
        String confirmacao = "";
        if (valor % 3 == 0) {
            confirmacao = "Valor " + valor + " é multiplo de 3";
        } else {
            confirmacao = "Valor " + valor + " não é multiplo de 3";
        }
        return confirmacao;
    }

    public static void exibir(double valor, String confirmacao) {
        JOptionPane.showMessageDialog(null, confirmacao);
    }
}
