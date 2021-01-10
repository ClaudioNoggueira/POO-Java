/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP01;

import javax.swing.JOptionPane;

public class LP01_05 {

    public static double lerRaio() {
        double raio = 0;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do RAIO em centímetros").replace(",", "."));
        return raio;
    }

    public static double lerAltura() {
        double altura = 0;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a ALTURA em centímetros.").replace(",", "."));
        return altura;
    }

    public static double calcularVolume(double altura, double raio) {
        double volume = 0;
        volume = (Math.PI * Math.pow(raio, 2)) * altura;
        return volume;
    }

    public static void exibir(double volume) {
        JOptionPane.showMessageDialog(null, "O valor do volume da lata eh: " + volume + " cm³");
    }
}
