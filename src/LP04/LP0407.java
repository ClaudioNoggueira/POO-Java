/*
7ª) Criar um programa que retorne o fatorial de um número, usando um método que receba um valor e retorne o fatorial desse valor.
Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120

 */
package LP04;

import javax.swing.JOptionPane;

public class LP0407 {

    public static int lerNumero() {
        int num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite um valor numérico."));

                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente números inteiros.",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    public static String lerEquacao(int numero) {
        String equacao = "";
        for (int i = numero; i >= 2; i--) {
            equacao += i + " x ";
        }
        equacao += "1";
        return equacao;
    }

    public static int lerFatorial(int numero) {
        int fatorial = 1;
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void exibirValores(int num, String equacao, int result) {
        JOptionPane.showMessageDialog(null,
                "Fatorial de " + num
                + "\n" + equacao + " = " + result);
    }

    public static void main(String[] args) {
        int num, result;
        String equacao;
        num = lerNumero();
        equacao = lerEquacao(num);
        result = lerFatorial(num);
        exibirValores(num, equacao, result);
    }
}
