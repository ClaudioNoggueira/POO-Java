/*
2ª) Criar um programa que receba 4 notas e calcule a média aritmética, através de um
método.

 */
package LP04;

import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
public class LP0402 {

    public static float lerNota1() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog("Insira a 1ª nota.").replace(",", "."));
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

    public static float lerNota2() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog("Insira a 2ª nota").replace(",", "."));
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

    public static float lerNota3() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog("Insira a 3ª nota").replace(",", "."));
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

    public static float lerNota4() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog("Insira a 4ª nota").replace(",", "."));
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

    public static double mediaAritmetica(float n1, float n2, float n3, float n4) {
        double mediaA = 0;
        mediaA = (n1 + n2 + n3 + n4) / 4;
        return mediaA;
    }

    public static void exibirValores(float n1, float n2, float n3, float n4, double mediaA) {
        JOptionPane.showMessageDialog(
                null, "1ª nota: " + n1
                + "\n2ª nota: " + n2
                + "\n3ª nota: " + n3
                + "\n4ª nota: " + n4
                + "\n\nMédia: " + mediaA);
    }

    public static void main(String[] args) {
        float n1, n2, n3, n4;
        double mediaA;
        n1 = lerNota1();
        n2 = lerNota2();
        n3 = lerNota3();
        n4 = lerNota4();
        mediaA = mediaAritmetica(n1, n2, n3, n4);
        exibirValores(n1, n2, n3, n4, mediaA);
    }
}
