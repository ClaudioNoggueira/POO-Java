/*
6ª) Criar um programa que receba um número que corresponda a um mês do 1º trimestre e
escreva o mês correspondente; caso o usuário digite o número fora do intervalo deverá
aparecer inválido, mas utilizando um método do tipo void
 */
package MVC_LP04;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LP0406_Controle {

    Connection con = Conexao.abrirConexao();
    LP0406_DAO exDAO = new LP0406_DAO(con);
    
    public int lerMes() {
        int mes = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                mes = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite o número correspondente ao mês do 1ª trimestre.").replace(",", "."));
                if (mes > 3 || mes < 1) {
                    JOptionPane.showMessageDialog(null,
                            "Digite um número entre 1 e 3, correspondente a um mês",
                            "Valor fora do intervalo",2);
                } else {
                    valorValido = true;
                }
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
        return mes;
    }
    public String nomeDoMes(LP0406_BEAN exBEAN){
        String mes = "";
        switch(exBEAN.getMes()){
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
        }
        return mes;
    }
     public LP0406_BEAN inserirDados(LP0406_BEAN exBEAN){
        return exDAO.inserirValores(exBEAN);
    }
    
    public List<LP0406_BEAN> listarDados(){
        List<LP0406_BEAN> listaDeNumeros = new ArrayList<LP0406_BEAN>();
        listaDeNumeros = exDAO.listarDados();
        return listaDeNumeros;
    }
}
