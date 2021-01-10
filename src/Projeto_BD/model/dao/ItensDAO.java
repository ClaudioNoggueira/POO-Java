/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.model.dao;

import Projeto_BD.model.bean.ItensBEAN;
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
public class ItensDAO {

    private Connection con;

    public ItensDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public ItensBEAN inserir(ItensBEAN itensBEAN) {
        String sql = "insert into itens_pedido(idPedido, idProduto, qtde) values(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, itensBEAN.getIdPedido());
            ps.setInt(2, itensBEAN.getIdProduto());
            ps.setDouble(3, itensBEAN.getQtde());

            if (ps.executeUpdate() > 0) {
                itensBEAN.setStatus("Registro inserido com sucesso");
            } else {
                itensBEAN.setStatus("Erro ao inserir registro");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            itensBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return itensBEAN;
    }

    public ItensBEAN consultarID(ItensBEAN itensBEAN) {
        String sql = "select * from itens_pedido where idItens = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, itensBEAN.getIdItem());
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    itensBEAN.setIdItem(rs.getInt(1));
                    itensBEAN.setIdPedido(rs.getInt(2));
                    itensBEAN.setIdProduto(rs.getInt(3));
                    itensBEAN.setQtde(rs.getDouble(4));
                    itensBEAN.setStatus("Retorno da pesquisa:");
                }
            }
            if (itensBEAN.getStatus() != "Retorno da pesquisa:") {
                itensBEAN.setIdPedido(0);
                itensBEAN.setIdProduto(0);
                itensBEAN.setQtde(0);
                itensBEAN.setStatus("Sem resultados.");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            itensBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return itensBEAN;
    }

    public ItensBEAN alterar(ItensBEAN itensBEAN) {
        String sql = "update itens_pedido set idPedido = ?, idProduto = ?, qtde = ?"
                + " where idItens = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, itensBEAN.getIdPedido());
            ps.setInt(2, itensBEAN.getIdProduto());
            ps.setDouble(3, itensBEAN.getQtde());
            ps.setInt(4, itensBEAN.getIdItem());

            if (ps.executeUpdate() > 0) {
                itensBEAN.setStatus("Registro alterado com sucesso");
            } else {
                itensBEAN.setStatus("Erro ao alterar registro");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            itensBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return itensBEAN;
    }

    public ItensBEAN excluir(ItensBEAN itensBEAN) {
        String sql = "delete from itens_pedido where idItens = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, itensBEAN.getIdItem());
            if (ps.executeUpdate() > 0) {
                itensBEAN.setStatus("Registro excluído com sucesso");
            } else {
                itensBEAN.setStatus("Erro ao excluir registro");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            itensBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return itensBEAN;
    }
    public List<ItensBEAN> listar(){
        List<ItensBEAN> listaDados = new ArrayList<>();
        String sql = "select * from itens_pedido";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs!= null){
                while(rs.next()){
                    ItensBEAN itens = new ItensBEAN();
                    itens.setIdItem(rs.getInt(1));
                    itens.setIdPedido(rs.getInt(2));
                    itens.setIdProduto(rs.getInt(3));
                    itens.setQtde(rs.getDouble(4));
                    listaDados.add(itens);
                }
            }
            ps.close();
            con.close();
        }catch(SQLException erro){
            ItensBEAN itensBEAN = new ItensBEAN();
            itensBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
            listaDados.add(itensBEAN);
        }
        return listaDados;
    }
}
