/*
1) Um programa capaz de imprimir todos os números pares em um intervalo de
números informador pelo usuário;
 */
package LP03;

import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class LP03_01 {

    public static String lerPrimeiroNum() {
        int valorUm = 0;
        try {
            valorUm = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o valor inicial do intervalo.").replace(",", "."));
            return String.valueOf(valorUm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite somente números inteiros."
                    + "\nCampo também não pode ficar nulo",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String lerSegundoNum(String valorUm) {
        try {
            if (valorUm != "Valor inválido") {
                int valorDois = 0;
                valorDois = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite o valor final do intervalo.").replace(",", "."));
                return String.valueOf(valorDois);
            } else {
                return "Valor inválido";
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite somente números inteiros."
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String numerosPares(String inicio, String fim) {
        if (inicio != "Valor inválido" && fim != "Valor inválido") {
            String pares = "| ";
            for (int i = Integer.parseInt(inicio); i < Integer.parseInt(fim); i++) {
                if (i % 2 == 0) {
                    pares += i + " | ";
                }
            }
            return pares;
        } else {
            return "Valor inválido";
        }

    }

    public static void exibirPares(String inicio, String fim, String pares) {
        if (inicio != "Valor inválido" && fim != "Valor inválido" && pares != "Valor inválido") {
            JOptionPane.showMessageDialog(null,
                    "Números pares entre "
                    + inicio + " e " + fim
                    + ":\n" + pares);
        }
    }
}
