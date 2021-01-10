/*
4) Um programa que calcule a média de uma aluno nos moldes da Fatec Zona SUL
 */
package LP03;

import javax.swing.JOptionPane;

public class LP03_04 {

    public static String lerP1() {
        try {
            float p1 = 0;
            p1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da P1").replace(",", "."));
            return String.valueOf(p1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite somente valores numéricos, com não mais de uma vírgula"
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String lerP2(String p1) {
        try {
            if (p1 != "Valor inválido") {
                float p2 = 0;
                p2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da P2").replace(",", "."));
                return String.valueOf(p2);
            } else {
                return "Valor inválido";
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite somente valores numéricos, com não mais de uma vírgula"
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String lerTrabalho(String p1, String p2) {
        try {
            if (p1 != "Valor inválido" && p2 != "Valor inválido") {
                float trab = 0;
                trab = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota do Trabalho").replace(",", "."));
                return String.valueOf(trab);
            } else {
                return "Valor inválido";
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Digite somente valores numéricos, com não mais de uma vírgula"
                    + "\nCampo também não pode ficar nulo.",
                    "Erro na entrada de dados", 2);
            return "Valor inválido";
        }
    }

    public static String mediaFatec(String p1, String p2, String trabalho) {
        if (p1 != "Valor inválido" && p1 != "Valor inválido" && trabalho != "Valor inválido") {
            float media = 0;
            float prova1 = 0;
            float prova2 = 0;
            float trab = 0;
            prova1 = Float.parseFloat(p1);
            prova2 = Float.parseFloat(p2);
            trab = Float.parseFloat(trabalho);

            media = (float) (prova1 * 0.35 + prova2 * 0.5 + trab * 0.15);
            return String.valueOf(media).replace(".", ".");
        } else {
            return "Valor inválido";
        }
    }

    public static void exibirMedia(String p1, String p2, String trabalho, String media) {
        if (p1 != "Valor inválido" && p1 != "Valor inválido"
                && trabalho != "Valor inválido" && media != "Valor inválido") {
            JOptionPane.showMessageDialog(null,
                    "Nota na P1: " + p1
                    + "\nNota na P2: " + p2
                    + "\nNota no trabalho: " + trabalho
                    + "\n\nMedia final: " + media);
        }
    }
}
