/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP01;
import javax.swing.JOptionPane;
public class LP01_03 {
    public static float lerValor1() {
        float vl1 = 0;
        vl1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o 1º valor.").replace(",", "."));
        return vl1;
    }

    public static float lerValor2() {
        float vl2 = 0;
        vl2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o 2º valor.").replace(",", "."));
        return vl2;
    }

    public static float calcMedia(float valor1, float valor2) {
        float M = 0;
        M = (valor1 + valor2) / 2;
        return M;
    }

    public static void exibir(float valor1, float valor2, float media) {
        JOptionPane.showMessageDialog(null, "A média entre os valores "
                + valor1 + " e " + valor2 + " é: " + media);
    }
}
