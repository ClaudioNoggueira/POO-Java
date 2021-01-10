/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_LP04;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LP0408_Controle {
    
    Connection con = Conexao.abrirConexao();
    LP0408_DAO exDAO = new LP0408_DAO(con);
    
    public int lerNumero() {
        int numero = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor numérico."));

                valorValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente números inteiros.\n" + e.getMessage(),
                        "Erro de formato", 2);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.\n" + e.getMessage(),
                        "Valor inválido", 2);
            }
        }
        
        return numero;
    }

    public boolean lerNumPrimo(LP0408_BEAN exBEAN) {
        boolean primo = false;
        int counter = 0;
        for (int num = exBEAN.getNumero(); num >= 1; num--) {
            if (exBEAN.getNumero() % num == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            primo = true;
        }
        return primo;
    }
    
    public LP0408_BEAN adicionarDados(LP0408_BEAN exBEAN){
        return exDAO.adicionarDados(exBEAN);
    }
    public List<LP0408_BEAN> listarDados(){
        List<LP0408_BEAN> listaDeDados = new ArrayList<LP0408_BEAN>();
        listaDeDados = exDAO.listarDados();
        return listaDeDados;
    }
}
