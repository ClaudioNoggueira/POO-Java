/*
2ª) Criar um programa que receba 4 notas e calcule a média aritmética, através de um
método.
 */
package MVC_LP04;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import MVC_LP04.Conexao;

/**
 *
 * @author claud
 */
public class LP0402_Controle {

    Connection con = Conexao.abrirConexao();
    LP0402_DAO exDAO = new LP0402_DAO(con);

    public double lerNota1() {
        double nota1 = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                nota1 = Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite o valor da nota 1").replace(",", "."));
                //Se a instrução de cima não der erro, a proxima instrução será lida
                //e o loop fechará
                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos",
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ser nulo.",
                        "Erro de validação", 2);
            }
        }
        return nota1;
    }

    public double lerNota2() {
        double nota2 = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                nota2 = Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite o valor da nota 2").replace(",", "."));

                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos",
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ser nulo.",
                        "Erro de validação", 2);
            }
        }
        return nota2;
    }

    public double lerNota3() {
        double nota3 = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                nota3 = Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite o valor da nota 3").replace(",", "."));

                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos",
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ser nulo.",
                        "Erro de validação", 2);
            }
        }
        return nota3;
    }

    public double lerNota4() {
        double nota4 = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                nota4 = Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite o valor da nota 4").replace(",", "."));

                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos",
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ser nulo.",
                        "Erro de validação", 2);
            }
        }
        return nota4;
    }

    public static double mediaAritmetica(LP0402_BEAN exBEAN) {
        double mediaA;
        mediaA = (exBEAN.getNota1()
                + exBEAN.getNota2()
                + exBEAN.getNota3()
                + exBEAN.getNota4()) / 4;
        return mediaA;
    }

    public LP0402_BEAN inserirNumeros(LP0402_BEAN exBEAN) {
        return this.exDAO.inserirNumeros(exBEAN);
    }

    public List<LP0402_BEAN> listarValores() {
        List<LP0402_BEAN> listaValores = new ArrayList<LP0402_BEAN>();
        listaValores = exDAO.listarValores();
        return listaValores;
    }
}
