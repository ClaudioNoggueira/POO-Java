/*
2º) Ler três números e mostrá-los em ordem crescente.
 */
package LP02;

import javax.swing.JOptionPane;

public class LP02_02 {

    public static double lerValor1() {
        double vl1 = 0;
        vl1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor númerico").replace(",", "."));
        return vl1;
    }

    public static double lerValor2() {
        double vl2 = 0;
        vl2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor númerico").replace(",", "."));
        return vl2;
    }

    public static double lerValor3() {
        double vl3 = 0;
        vl3 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor númerico").replace(",", "."));
        return vl3;
    }

    public static String ordemCrescente(double valor1, double valor2, double valor3) {
        String ordem = "";
        if (valor1 <= valor2 && valor1 <= valor3 && valor2 <= valor3) {
            ordem = "Valores em ordem cresente: " + valor1 + " - " + valor2 + " - " + valor3;
        } else if (valor1 <= valor2 && valor1 <= valor3 && valor3 <= valor2) {
            ordem = "Valores em ordem crescente: " + valor1 + " - " + valor3 + " - " + valor2;
        } else if (valor2 <= valor1 && valor2 <= valor3 && valor1 <= valor3) {
            ordem = "Valores em ordem crescente: " + valor2 + " - " + valor1 + " - " + valor3;
        } else if (valor2 <= valor1 && valor2 <= valor3 && valor3 <= valor1) {
            ordem = "Valores em ordem crescente: " + valor2 + " - " + valor3 + " - " + valor1;
        } else if (valor3 <= valor1 && valor3 <= valor2 && valor2 <= valor1) {
            ordem = "Valores em ordem crescente: " + valor3 + " - " + valor2 + " - " + valor1;
        } else if (valor3 <= valor1 && valor3 <= valor2 && valor1 <= valor2) {
            ordem = "Valores em ordem crescente: " + valor3 + " - " + valor1 + " - " + valor2;
        }
        return ordem;
    }

    public static void exibir(double valor1, double valor2, double valor3, String ordem) {
        JOptionPane.showMessageDialog(null,
                "Valores digitados: " + valor1 + " - " + valor2 + " - " + valor3
                + "\n" + ordem);
    }
}
