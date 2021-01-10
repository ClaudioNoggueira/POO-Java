/*
2) Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série:
1,1,2,3,5,8,13,21.......
Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8
 */
package LP03;

import javax.swing.JOptionPane;

public class LP03_02 {

    public static String lerTermo() {
        try {
            int termo = 0;
            termo = Integer.parseInt(JOptionPane.showInputDialog("Digite o enésimo termo de fibonacci"));
            return String.valueOf(termo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite somente números inteiros."
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String sequenciaFibonacci(String termo) {
        if (termo != "Valor inválido") {
            String sequencia = "";
            int v1 = 1;
            int v2 = 0;
            int result = 0;
            if (Integer.parseInt(termo) > 0) {
                for (int i = 0; i < Integer.parseInt(termo); i++) {
                    if (Integer.parseInt(termo) == 1) {
                        sequencia = "1";
                        i = Integer.parseInt(termo);
                    } else if (Integer.parseInt(termo) == 2) {
                        sequencia = "1 1";
                        i = Integer.parseInt(termo);
                    } else {
                        result = v1 + v2;
                        sequencia += " " + result;
                        v1 = v2;
                        v2 = result;
                    }
                }
                return sequencia;
            } else {
                return "A sequencia de Fibonacci sempre começa com valores ";
            }

        } else {
            return "Valor inválido";
        }
    }

    public static void exibirSequencia(String termo, String sequencia) {
        if (termo != "Valor inválido" && sequencia != "Valor invalido") {
            JOptionPane.showMessageDialog(null,
                    "Sequencia de Fibonacci até o "
                    + termo + "º termo:"
                    + "\n" + sequencia);
        }
    }
}
