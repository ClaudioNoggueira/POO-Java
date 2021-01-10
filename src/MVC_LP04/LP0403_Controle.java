/*
3ª) Criar um programa que receba 2 valores e calcule o produto através de um método que
retorna valores.
 */
package MVC_LP04;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LP0403_Controle {

    Connection con = Conexao.abrirConexao();
    LP0403_DAO exDAO = new LP0403_DAO(con);

    public double lerValor1() {
        double valor1 = 0;
        boolean valorValido = false;
        while (valorValido != true) {
            try {
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º valor.").replace(",", "."));

                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos.",
                        "Valor inválido", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            }
        }
        return valor1;
    }

    public double lerValor2() {
        double valor2 = 0;
        boolean valorValido = false;
        while (valorValido != true) {
            try {
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º valor.").replace(",", "."));

                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos.",
                        "Valor inválido", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            }
        }
        return valor2;
    }

    public double calcularProduto(LP0403_BEAN exBEAN) {
        double produto = 0;
        produto = exBEAN.getValor1() * exBEAN.getValor2();
        return produto;
    }

    public LP0403_BEAN inserirValores(LP0403_BEAN exBEAN) {
        return exDAO.inserirValores(exBEAN);
    }

    public List<LP0403_BEAN> listarValores() {
        List<LP0403_BEAN> listaValores = new ArrayList<LP0403_BEAN>();
        listaValores = exDAO.listarValores();
        return listaValores;
    }
}
