/*
1ª) Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro, através de um método.
 */
package LP04;

import javax.swing.JOptionPane;

public class LP0401 {

    public static int lerNumero() {
        int num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente números inteiros.",
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    public static int dobro(int numero) {
        int dobro = 0;
        dobro = numero * 2;
        return dobro;
    }

    public static void exibirNumeros(int numero, int dobro) {
        JOptionPane.showMessageDialog(null,
                "Número inserido: " + numero
                + "\nDobro: " + dobro);
    }

    public static void main(String[] args) {
        int numero, dobro;
        numero = lerNumero();
        dobro = dobro(numero);
        exibirNumeros(numero, dobro);
    }
}
