/*
7ª) Criar um programa que retorne o fatorial de um número, usando um método que receba
um valor e retorne o fatorial desse valor.
Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120
 */
package MVC_LP04;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LP0407_Controle {
    
    Connection con = Conexao.abrirConexao();
    LP0407_DAO exDAO = new LP0407_DAO(con);
    public int lerNumero() {
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

    public String lerEquacao(LP0407_BEAN exBEAN) {
        String equacao = "";
        for (int i = exBEAN.getNumero(); i >= 2; i--) {
            equacao += i + " x ";
        }
        equacao += " 1";
        return equacao;
    }

    public int lerFatorial(LP0407_BEAN exBEAN) {
        int fatorial = 1;
        for (int i = exBEAN.getNumero(); i >= 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    public LP0407_BEAN inserirValores(LP0407_BEAN exBEAN) {
        return exDAO.inserirValores(exBEAN);
    }

    public List<LP0407_BEAN> listarValores() {
        List<LP0407_BEAN> listaDeValores = new ArrayList<LP0407_BEAN>();
        listaDeValores = exDAO.listarValores();
        return listaDeValores;
    }
}
