package MVC_LP08;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class FaturarDAO {

    private Connection con;

    public FaturarDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    FaturarBEAN inserir(FaturarBEAN exBEAN) {
        String sql = "insert into LP0801(numItem, descricao, qtde, preco, data_adicao) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, exBEAN.getNumItem());
            ps.setString(2, exBEAN.getDescricao());
            ps.setFloat(3, exBEAN.getQtde());
            ps.setFloat(4, exBEAN.getPreco());
            ps.setString(5, exBEAN.getData_adicao());

            if (ps.executeUpdate() > 0) {
                System.out.println("Adicionado com sucesso ao banco.");
            } else {
                System.out.println("Erro ao adicionar.");
            }
            return exBEAN;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return exBEAN;
    }

    List<FaturarBEAN> listar() {
        List<FaturarBEAN> listaDeDados = new ArrayList<>();
        String sql = "select * from LP0801";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    FaturarBEAN exBEAN = new FaturarBEAN();
                    exBEAN.setNumItem(rs.getInt(1));
                    exBEAN.setDescricao(rs.getString(2));
                    exBEAN.setQtde(rs.getFloat(3));
                    exBEAN.setPreco(rs.getFloat(4));
                    exBEAN.setData_adicao(rs.getString(5));
                    listaDeDados.add(exBEAN);
                }
                return listaDeDados;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
