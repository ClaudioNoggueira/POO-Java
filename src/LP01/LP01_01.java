/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP01;

import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
public class LP01_01 {

    public static String lerNomeProduto() {
        try {
            String nomeProd = "";
            nomeProd = JOptionPane.showInputDialog("Digite o nome do produto");
            return nomeProd;
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(null, "Erro", "Valor inválido", 0);
            return " - ";
        } catch (NullPointerException NPE) {
            JOptionPane.showMessageDialog(null, "Erro", "Insira um valor.", 0);
            return " - ";
        }

    }

    public static String lerValorOriginal() {
        try {
            String vlOriginal = "";
            vlOriginal = JOptionPane.showInputDialog("Digite o valor do produto").replace(",", ".");
            return vlOriginal;
        } catch (NumberFormatException NFE) {
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro de formato", 0);
            return "Valor inválido";
        } catch (NullPointerException NPE) {
            JOptionPane.showMessageDialog(null, "Insira um valor", "Erro de entrada", 0);
            return "Valor inválido";
        }

    }

    public static float desconto(String valorOriginal) {
        float desconto = 0;
        desconto = (float) (Double.parseDouble(valorOriginal) * 0.91);
        return desconto;
    }

    public static void exibir(String nomeProduto, String valorOriginal, float valorDescontado) {
        JOptionPane.showMessageDialog(null,
                "Item: " + nomeProduto
                + "\nValor original: R$ " + valorOriginal
                + "\nValor com desconto de 9%: R$ " + valorDescontado);
    }
}
