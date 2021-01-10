/*
1ª) Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro,
através de um método.
 */
package MVC_LP04;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LP0401_Controle {

    Connection con = Conexao.abrirConexao();
    LP0401_DAO exDAO = new LP0401_DAO(con);

    public static int lerValor() {
        int valor = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente números inteiros",
                        "Valor inválido", 2);
            }
        }
        return valor;
    }

    public int dobrarValor(LP0401_BEAN exBEAN) {
        int dobro = 0;
        dobro = exBEAN.getEntrada() * 2;
        return dobro;
    }

    public LP0401_BEAN inserirNumero(LP0401_BEAN exBEAN) {
        return exDAO.inserirNumero(exBEAN);
    }

    public List<LP0401_BEAN> listarNumeros() {
        List<LP0401_BEAN> listaNumeros = new ArrayList<LP0401_BEAN>();
        listaNumeros = exDAO.listar();
        return listaNumeros;
    }
}
