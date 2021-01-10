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

public class LP0405_Controle {
    Connection con = Conexao.abrirConexao();
    LP0405_DAO exDAO = new LP0405_DAO(con);
    
    public double lerValor1() {
        double valor1 = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {   
                valor1 = Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite um valor numérico.").replace(",", "."));
                
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos.",
                        "Valor inválido", 2);
            }
        }
        return valor1;
    }
    
    public double lerValor2() {
        double valor2 = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {   
                valor2 = Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite outro valor numérico.").replace(",", "."));
                
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos.",
                        "Valor inválido", 2);
            }
        }
        return valor2;
    }
    
    public double lerMaiorNumero(LP0405_BEAN exBEAN){
        double maior = 0;
        if(exBEAN.getValor1() > exBEAN.getValor2()){
            maior = exBEAN.getValor1();
        }else{
            maior = exBEAN.getValor2();
        }
        return maior;
    }
    
    public LP0405_BEAN inserirNumeros(LP0405_BEAN exBEAN){
        return exDAO.inserirNumeros(exBEAN);
    }
    
    public List<LP0405_BEAN> listarNumeros(){
        List<LP0405_BEAN> listaDeNumeros = new ArrayList<LP0405_BEAN>();
        listaDeNumeros = exDAO.listarNumeros();
        return listaDeNumeros;
    }
}
