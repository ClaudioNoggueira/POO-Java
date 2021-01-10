/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.model.dao;

import Projeto_BD.model.bean.PedidoBEAN;
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
public class PedidoDAO {

    private Connection con;

    public PedidoDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public PedidoBEAN inserir(PedidoBEAN pedBEAN) {
        String sql = "insert into pedido(idCliente, data_pedido) values(?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, pedBEAN.getIdCliente());
            ps.setString(2, pedBEAN.getData_pedido());

            if (ps.executeUpdate() > 0) {
                pedBEAN.setStatus("Pedido inserido com sucesso!");
            } else {
                pedBEAN.setStatus("Erro ao inserir pedido");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            pedBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return pedBEAN;
    }

    public PedidoBEAN consultarID(PedidoBEAN pedBEAN) {
        String sql = "select * from pedido where idPedido = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, pedBEAN.getIdPedido());
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    pedBEAN.setIdPedido(rs.getInt(1));
                    pedBEAN.setData_pedido(rs.getString(2));
                    pedBEAN.setIdCliente(rs.getInt(3));
                    pedBEAN.setStatus("Retorno da consulta:");
                }
            }
            if (pedBEAN.getStatus() != "Retorno da consulta:") {
                pedBEAN.setStatus("Sem resultado para pedido nº " + pedBEAN.getIdPedido());
                pedBEAN.setIdCliente(0);
                pedBEAN.setData_pedido("-");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            pedBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return pedBEAN;
    }

    public List<PedidoBEAN> consultarData(PedidoBEAN pedBEAN) {
        List<PedidoBEAN> listaDados = new ArrayList<>();
        String sql = "select * from pedido where data_pedido = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, pedBEAN.getData_pedido());
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    PedidoBEAN pedido = new PedidoBEAN();
                    pedido.setIdPedido(rs.getInt(1));
                    pedido.setData_pedido(rs.getString(2));
                    pedido.setIdCliente(rs.getInt(3));
                    pedido.setStatus("Retorno da pesquisa:");
                    pedBEAN.setStatus("Retorno da pesquisa:");
                    listaDados.add(pedido);
                }
            }
            if (pedBEAN.getStatus() != "Retorno da pesquisa:") {
                pedBEAN.setStatus("Sem resultados para pedidos feitos em " + pedBEAN.getData_pedido());
                pedBEAN.setIdPedido(0);
                pedBEAN.setIdCliente(0);
                pedBEAN.setData_pedido("-");
                listaDados.add(pedBEAN);
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            pedBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
            listaDados.add(pedBEAN);
        }
        return listaDados;
    }

    public PedidoBEAN alterar(PedidoBEAN pedBEAN) {
        String sql = "update pedido set idCliente = ?, data_pedido = ? where idPedido = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, pedBEAN.getIdCliente());
            ps.setString(2, pedBEAN.getData_pedido());
            ps.setInt(3, pedBEAN.getIdPedido());

            if (ps.executeUpdate() > 0) {
                pedBEAN.setStatus("Pedido nº " + pedBEAN.getIdPedido() + " alterado com sucesso!");
            } else {
                pedBEAN.setStatus("Erro ao alterar pedido");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            pedBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return pedBEAN;
    }

    public PedidoBEAN excluir(PedidoBEAN pedBEAN) {
        String sql = "delete from pedido where idPedido = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, pedBEAN.getIdPedido());

            if (ps.executeUpdate() > 0) {
                pedBEAN.setStatus("Pedido nº " + pedBEAN.getIdPedido() + " excluído com sucesso.");
            } else {
                pedBEAN.setStatus("Erro ao excluir pedido");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            pedBEAN.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return pedBEAN;
    }

    public List<PedidoBEAN> listar() {
        List<PedidoBEAN> listaDados = new ArrayList<>();
        String sql = "select * from pedido";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    PedidoBEAN pedido = new PedidoBEAN();
                    pedido.setIdPedido(rs.getInt(1));
                    pedido.setData_pedido(rs.getString(2));
                    pedido.setIdCliente(rs.getInt(3));

                    listaDados.add(pedido);
                }
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            PedidoBEAN pedido = new PedidoBEAN();
            pedido.setStatus("Erro nº " + erro.getErrorCode() + "\n" + erro.getMessage());
            listaDados.add(pedido);
        }
        return listaDados;
    }
}
