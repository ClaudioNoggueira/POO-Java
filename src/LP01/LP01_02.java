/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP01;
import javax.swing.JOptionPane;
public class LP01_02 {
    public static float lerSalarioMinimo() {
        float SM = 0;
        SM = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salario mínimo.").replace(",", "."));
        return SM;
    }

    public static float lerSalarioPessoal() {
        float SP = 0;
        SP = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salario da pessoa.").replace(",", "."));
        return SP;
    }

    public static int qtdeSalariosMininos(float SalarioMinimo, float SalarioPessoal) {
        int qtdeSM = 0;
        qtdeSM = (int) (SalarioPessoal / SalarioMinimo);
        return qtdeSM;
    }

    public static void exibir(float SM, float SP, float qtdeSM) {
        JOptionPane.showMessageDialog(null, SP + " reais de salario"
                + " equivalem a " + qtdeSM + " salários mínimos");
    }
}
