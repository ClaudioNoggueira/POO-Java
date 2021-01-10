/*
3) Um programa capaz de imprimir todos os números primos em um intervalo de
números informado pelo usuário;
 */
package LP03;

import javax.swing.JOptionPane;

public class LP03_03 {

    public static String lerInicio() {
        try {
            int inicio = 0;
            inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite valor inicial do intervalo de números"));
            return String.valueOf(inicio);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite somente números inteiros."
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String lerFim(String inicio) {
        try {
            if (inicio != "Valor inválido") {
                int fim = 0;
                fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final do intervalo"));
                return String.valueOf(fim);
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

    public static String numPrimos(String inicio, String fim) {
        if (inicio == "Valor inválido" || fim == "Valor inválido") {
            return "Valor inválido";
        } else {
            String numPrimos = "";
            int intervalo = 1;
            if (Integer.parseInt(inicio) >= 0) {
                intervalo = Integer.parseInt(fim) - Integer.parseInt(inicio);
            }else{
                intervalo = Integer.parseInt(fim) + Integer.parseInt(inicio);
            }
            if (intervalo < 0) {
                return "Não há numeros primos entre os números negativos.";
            } else {
                for (int i = Integer.parseInt(inicio); i < Integer.parseInt(fim); i++) {
                    //Counter == qtde de numeros primos
                    int counter = 0;
                    for (int num = i; num >= 1; num--) {
                        if (i % num == 0) {
                            counter++;
                        }
                    }
                    //Se for divizivel por mais de 2 numeros não eh primo
                    if (counter == 2) {
                        numPrimos += " " + i;
                    }
                }
                return numPrimos;
            }
        }
    }

    public static void exibirNumPrimos(String inicio, String fim, String primos) {
        if (inicio != "Valor inválido" && fim != "Valor inválido" && primos != "Valor inválido") {
            JOptionPane.showMessageDialog(null,
                    "Números primos entre " + inicio + " e " + fim + ":"
                    + "\n" + primos);
        }
    }
}
