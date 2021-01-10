/*
4ª) Criar um programa que receba um grau e o converta para radianos através de um
método.
Fórmula: radiano = grau * pi / 180

 */
package LP04;

import javax.swing.JOptionPane;

public class LP0404 {

    public static float lerGrau() {
        float num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog(
                        "Insira o valor em grau para convertê-lo em radiano").replace(",", "."));
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

    public static float converterRadianos(float grau) {
        float radiano = 0;
        radiano = (float) (grau * Math.PI / 180);
        return radiano;
    }

    public static void exibirValores(float grau, float radianos) {
        JOptionPane.showMessageDialog(null,
                "Valor inserido: " + grau
                + "\nConvertido para radiano: " + radianos);
    }

    public static void main(String[] args) {
        float grau, radianos;
        grau = lerGrau();
        radianos = converterRadianos(grau);
        exibirValores(grau, radianos);
    }
}
