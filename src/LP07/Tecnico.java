/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP07;

import javax.swing.JOptionPane;

public class Tecnico extends Superior{
    
    @Override
    void lerN1() {
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                setN1(Float.parseFloat(
                        JOptionPane.showInputDialog("Técnico\nDigite a nota do 1º trimestre.").replace(",", ".")));
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
    }

    @Override
    void lerN2() {
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                setN2(Float.parseFloat(
                        JOptionPane.showInputDialog("Técnico\nDigite a nota do 1º trimestre.").replace(",", ".")));
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
    }

    @Override
    void lerN3() {
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                setN3(Float.parseFloat(
                        JOptionPane.showInputDialog("Técnico\nDigite a nota do 1º trimestre.").replace(",", ".")));
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
    }
    
    @Override
    public void calculaMedia(){
        setMedia((float) (n1 + n2 *2 + n3* 2)/5);
    }
}
