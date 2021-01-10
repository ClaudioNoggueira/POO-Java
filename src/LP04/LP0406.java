/*
6ª) Criar um programa que receba um número que corresponda a um mês do 1º trimestre
e escreva o mês correspondente; caso o usuário digite o número fora do intervalo
deverá aparecer inválido, mas utilizando um método do tipo void.
 */
package LP04;

import javax.swing.JOptionPane;

public class LP0406 {

    public static int lerMes() {
        int mes = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                mes = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite um número inteiro correspondente a um mês do 1º trimestre"));
                if (mes > 3 || mes < 1) {
                    JOptionPane.showMessageDialog(null,
                            "Digite somente um número entre 1 e 3, correspondente a um mês do 1º trimestre.");
                } else {
                    valorValido = true;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio\n",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente números inteiros.\n",
                        "Erro de formato", 2);
            }
        }
        return mes;
    }

    public static String nomeDoMes(int mes) {
        String nomeDoMes = "";
        switch (mes) {
            case 1:
                nomeDoMes = "Janeiro";
                break;
            case 2:
                nomeDoMes = "Fevereiro";
                break;
            case 3:
                nomeDoMes = "Março";
                break;
        }
        return nomeDoMes;
    }

    public static void exibirValores(int mes, String nomeDoMes) {
        JOptionPane.showMessageDialog(null,
                "Nº digitado: " + mes
                + "\nMês correspondente: " + nomeDoMes);
    }

    public static void main(String[] args) {
        int mes;
        String nomeDoMes;
        mes = lerMes();
        nomeDoMes = nomeDoMes(mes);
        exibirValores(mes, nomeDoMes);
    }
}
