/*
4ª) Criar um programa que receba um grau e o converta para radianos através de um
método.
Fórmula: radiano = grau * pi / 180

 */
package MVC_LP04;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LP0404_Controle {
    
    Connection con = Conexao.abrirConexao();
    LP0404_DAO exDAO = new LP0404_DAO(con);
    
    public float lerGrau() {
        float grau = 0;
        boolean valorValido = false;
        while (valorValido != true) {
            try {
                grau = Float.parseFloat(JOptionPane.showInputDialog(
                        "Digite o grau para conversão em radianos").replace(",", "."));
                
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
        return grau;
    }
    public float converterRadianos(LP0404_BEAN exBEAN){
        float radianos = 0;
        radianos = (float) (exBEAN.getGrau() * Math.PI / 180);
        return radianos;
    }
    
    public LP0404_BEAN inserirNumeros(LP0404_BEAN exBEAN){
        return exDAO.inserirNumeros(exBEAN);
    }
    
    public List<LP0404_BEAN> listarNumeros(){
        List<LP0404_BEAN> listaNumeros = new ArrayList<LP0404_BEAN>();
        listaNumeros = exDAO.listarNumeros();
        return listaNumeros;
    }
}
