/*
3ª) Criar um programa que receba 2 valores e calcule o produto através de um método que retorna valores.
 */
package LP04;

import javax.swing.JOptionPane;

public class LP0403 {

    public static float lerValor1() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog("Insira o 1º valor").replace(",", "."));
                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos.",
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    public static float lerValor2() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog("Insira o 2º valor").replace(",", "."));
                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos.",
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    public static float lerProduto(float valor1, float valor2) {
        float produto = 0;
        produto = valor1 * valor2;
        return produto;
    }

    public static void exibirValores(float valor1, float valor2, float produto) {
        JOptionPane.showMessageDialog(null,
                valor1 + " x " + valor2 + " = " + produto);
    }

    public static void main(String[] args) {
        float valor1, valor2, produto;
        valor1 = lerValor1();
        valor2 = lerValor2();
        produto = lerProduto(valor1, valor2);
        exibirValores(valor1, valor2, produto);
    }
}
