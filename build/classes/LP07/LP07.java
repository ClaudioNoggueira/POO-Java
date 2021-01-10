package lp07;

import javax.swing.JOptinPane;

public class Superior {
    private static float n1, n2, n3;

    public float lerN1() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(
                        JOptinPane.showInputDialog("Digite a nota da P1.").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    public float lerN2() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(
                        JOptinPane.showInputDialog("Digite a nota da P2.").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    public float lerN3() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(
                        JOptinPane.showInputDialog("Digite a nota do trabalho.").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    public void calculaMedia() {

    }
}