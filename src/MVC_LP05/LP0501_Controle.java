/*
1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura
de um triângulo. Na classe definir um método para leitura da base e altura, um método
construtor e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
No método principal do programa (main) , criar um objeto a partir da classe criada,
solicitar e atribuir os valores da base e altura e invocar o método que calcula a área a
partir do objeto criado.
 */
package MVC_LP05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class LP0501_Controle {

    Connection con = Conexao.abrirConexao();
    LP0501_DAO exDAO = new LP0501_DAO(con);
    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    public float lerBase() {
        float base = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro. Digite novamente.", "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente valores numéricos", "Valor inválido", 2);
            }
        }
        return base;
    }

    public float lerAltura() {
        float altura = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro. Digite novamente.", "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente valores numéricos", "Valor inválido", 2);
            }
        }
        return altura;
    }

    public float calcAreaTriangulo(LP0501_BEAN exBEAN) {
        float areaT = 0;
        areaT = (exBEAN.getBase() * exBEAN.getAltura()) / 2;
        return areaT;
    }
    
    public String lerData(){
        return formatador.format(data);
    }
    public LP0501_BEAN inserir(LP0501_BEAN exBEAN) {
        return exDAO.inserir(exBEAN);
    }
    public List<LP0501_BEAN> listar(){
        List<LP0501_BEAN> lista_de_dados = new ArrayList<LP0501_BEAN>();
        lista_de_dados = exDAO.listar();
        return lista_de_dados;
    }
}
