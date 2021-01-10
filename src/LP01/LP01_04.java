/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP01;

import javax.swing.JOptionPane;

public class LP01_04 {

    public static int lerCelsius() {
        int C = 0;
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite a tempetura em graus centígrados"));
        return C;
    }

    public static int converterFahrenheit(int celsius) {
        int F = 0;
        F = (9 * celsius + 160) / 5;
        return F;
    }

    public static void exibir(int celsius, int fahrenheit) {
        JOptionPane.showMessageDialog(null, celsius + "º centígrados"
                + " equivalem a:\n" + fahrenheit + "º fahrenheit");
    }
}
