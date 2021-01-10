/*
Criar um programa que leia um número que será o limite superior de um intervalo e
o incremento. Exibir todos os números naturais no intervalo de 0 até esse número.
Suponha que os dois números lidos são maiores que zero. Exemplo:
Limite superior: 20
Incremento: 5
Saída: 0 5 10 15 20

 */
package LP03;

import javax.swing.JOptionPane;

public class LP03_05 {

    public static String lerLimite() {
        try {
            float limite = 0;
            limite = Float.parseFloat(JOptionPane.showInputDialog("Digite o limite do intervalo").replace(",", "."));
            return String.valueOf(limite);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas valores numéricos, com não mais de uma vírgula."
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String lerSalto(String limite) {
        try {
            if (limite != "Valor inválido") {
                float salto = 0;
                salto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do incremento").replace(",", "."));
                return String.valueOf(salto);
            } else {
                return "Valor inválido";
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas valores numéricos, com não mais de uma vírgula."
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String sequencia(String limite, String salto) {
        if (limite != "Valor inválido" && salto != "Valor inválido") {
            String sequencia = "";
            for (int i = 0; i <= Float.parseFloat(limite); i += Float.parseFloat(salto)) {
                sequencia += i + " ";
            }
            return sequencia;
        } else {
            return "Valor inválido";
        }
    }

    public static void exibirSequencia(String limite, String salto, String sequencia) {
        if (limite != "Valor inválido" && salto != "Valor inválido"
                && sequencia != "Valor inválido") {
            JOptionPane.showMessageDialog(null,
                    "Limite do intervalo: " + limite
                    + "\nIncremento: " + salto
                    + "\n\nSequência:\n" + sequencia);
        }
    }
}
