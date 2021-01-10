/*
3º) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o
valor da compra for menor que R$20,00; caso contrário, o lucro será de 30%. Entrar
com o valor do produto e imprimir o valor da venda.
 */
package LP02;

import javax.swing.JOptionPane;

public class LP02_03 {

    public static double lerValorProduto() {
        double valor = 0;
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto").replace(",", "."));
        return valor;
    }

    public static String valorVenda(double valor) {
        String venda = "";
        if (valor < 20) {
            valor *= 1.45;
            venda = "Valor da venda com acréscimo de 45%"
                    + "\n R$ " + valor;
        } else {
            valor *= 1.30;
            venda = "Valor de venda com acrésimo de 30%"
                    + "\n R$ " + valor;
        }
        venda.replace(".", ",");
        return venda;
    }
    public static void exibir(double valorCompra, String valorVenda){
        JOptionPane.showMessageDialog(null, "Valor da compra: " + valorCompra
        + "\n " + valorVenda);
    }
}
