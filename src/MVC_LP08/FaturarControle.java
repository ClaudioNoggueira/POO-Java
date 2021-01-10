package MVC_LP08;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class FaturarControle {

    Connection con = Conexao.abrirConexao();
    FaturarDAO exDAO = new FaturarDAO(con);
    Date data = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    int lerNumItem() {
        int num = 0;
        boolean valorValido = false;
        while (!valorValido == true) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do item."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente numeros inteiros, sem nenhuma vírgula.",
                        "Valor inválido", 2);
            }
        }
        return num;
    }

    String lerDescricao() {
        String desc = "";
        boolean valorValido = false;
        while (!valorValido == true) {
            try {
                desc = JOptionPane.showInputDialog("Descreve o item.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Ocorreu um erro. Escreva novamente reformulando sua descrição;",
                        "Valor inválido", 2);
            }
        }
        return desc;
    }

    String lerData() {
        return formato.format(data);
    }

    float lerQtde() {
        float qtde = 0;
        boolean valorValido = false;
        while (!valorValido == true) {
            try {
                qtde = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade do item").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
        return qtde;
    }

    float lerPreco() {
        float preco = 0;
        boolean valorValido = false;
        while (!valorValido == true) {
            try {
                preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do item").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
        return preco;
    }

    FaturarBEAN inserir(FaturarBEAN exBEAN) {
        return exDAO.inserir(exBEAN);
    }

    List<FaturarBEAN> listar() {
        List<FaturarBEAN> listaDeDados = new ArrayList<>();
        listaDeDados = exDAO.listar();
        return listaDeDados;
    }

}
