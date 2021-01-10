/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_LP04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claud
 */
public class LP0403_DAO {

    private Connection con;

    public LP0403_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public LP0403_BEAN inserirValores(LP0403_BEAN exBEAN) {
        String sql = "Insert into LP0403(valor1, valor2, produto) Values(?,?,?)";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);

            ps.setDouble(1, exBEAN.getValor1());
            ps.setDouble(2, exBEAN.getValor2());
            ps.setDouble(3, exBEAN.getProduto());

            if (ps.executeUpdate() > 0) {
                System.out.println("Inserido com sucesso.");
                return exBEAN;
            } else {
                System.out.println("Erro ao inserir.");
                return exBEAN;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return exBEAN;
        }
        
    }

    public List<LP0403_BEAN> listarValores() {
        List<LP0403_BEAN> listaValores = new ArrayList<LP0403_BEAN>();
        String sql = "Select valor1, valor2, produto From LP0403";
        try {
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    LP0403_BEAN exBEAN = new LP0403_BEAN();
                    exBEAN.setValor1(rs.getDouble(1));
                    exBEAN.setValor2(rs.getDouble(2));
                    exBEAN.setProduto(rs.getDouble(3));
                    listaValores.add(exBEAN);
                }
                return listaValores;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
}
