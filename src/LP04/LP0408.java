/*
8ª) Criar um programa que verifique se um número é primo ou não, através de um 
método. Número primo é divisível somente por 1 e por ele mesmo.
 */
package LP04;

import javax.swing.JOptionPane;

public class LP0408 {

    public static int lerNumero() {
        int numero = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor numérico."));

                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente números inteiros.\n" + e.getMessage(),
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.\n" + e.getMessage(),
                        "Valor inválido", 2);
            }
        }

        return numero;
    }

    public static boolean lerNumPrimo(int numeroDigitado) {
        boolean primo = false;
        int counter = 0;
        for (int i = numeroDigitado; i >= 1; i--) {
            if (numeroDigitado % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            primo = true;
        }
        return primo;
    }

    public static void exibirValores(int num, boolean primo) {
        if (primo == true) {
            JOptionPane.showMessageDialog(null,
                    num + " eh primo.");
        } else {
            JOptionPane.showMessageDialog(null,
                    num + " não eh primo.");
        }
    }

    public static void main(String[] args) {
        int num;
        boolean primo;
        num = lerNumero();
        primo = lerNumPrimo(num);
        exibirValores(num, primo);
    }
}
