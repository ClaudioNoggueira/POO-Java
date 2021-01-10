/*
5ª) Criar um programa que mostre qual o maior valor entre dois números, 
utilizando um método do tipo void (que não retorna valores).
 */
package LP04;

import javax.swing.JOptionPane;

public class LP0405 {

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

    public static float maiorValor(float valor1, float valor2) {
        float maiorNum = 0;
        if (valor1 > valor2) {
            maiorNum = valor1;
        } else {
            maiorNum = valor2;
        }
        return maiorNum;
    }

    public static void exibirValores(float valor1, float valor2, float maiorNum) {
        JOptionPane.showMessageDialog(null,
                "1º Valor: " + valor1
                + "\n2º Valor: " + valor2
                + "\n\nMaior valor: " + maiorNum);
    }

    public static void main(String[] args) {
        float valor1, valor2, maiorNum;
        valor1 = lerValor1();
        valor2 = lerValor2();
        maiorNum = maiorValor(valor1, valor2);
        exibirValores(valor1, valor2, maiorNum);
    }
}
