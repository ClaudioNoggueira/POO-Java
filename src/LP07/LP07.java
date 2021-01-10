/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP07;

import javax.swing.JOptionPane;

public class LP07 {

    public static void main(String[] args) {

        Superior sup = new Superior();
        Tecnico tec = new Tecnico();

        sup.lerN1();
        sup.lerN2();
        sup.lerN3();

        sup.calculaMedia();

        JOptionPane.showMessageDialog(null,
                "Superior\n\n"
                + "Nota da P1: " + sup.getN1()
                + "\nNota da P2: " + sup.getN2()
                + "\nNota do Trabalho: " + sup.getN3()
                + "\n\nMédia: " + sup.getMedia());
        
        tec.lerN1();
        tec.lerN2();
        tec.lerN3();

        tec.calculaMedia();

        JOptionPane.showMessageDialog(null,
                "Técnico\n\n"
                + "Nota do 1º Trimestre: " + tec.getN1()
                + "\nNota do 2º Trimestre: " + tec.getN2()
                + "\nNota do 3º Trimestre: " + tec.getN3()
                + "\n\nMédia: " + tec.getMedia());

         
    }
}
