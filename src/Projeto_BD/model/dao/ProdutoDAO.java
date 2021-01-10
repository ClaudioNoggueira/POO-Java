/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.model.dao;

import Projeto_BD.model.bean.ProdutoBEAN;
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
public class ProdutoDAO {

    private Connection con;

    public ProdutoDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public ProdutoBEAN inserir(ProdutoBEAN prodBEAN) {
        String sql = "insert into produto(descricao, preco, unidade, qtde_inicial, qtde_atual, data_cad)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, prodBEAN.getDescricao());
            ps.setDouble(2, prodBEAN.getPreco());
            ps.setString(3, prodBEAN.getUnidade());
            ps.setDouble(4, prodBEAN.getQtde_inicial());
            ps.setDouble(5, prodBEAN.getQtde_atual());
            ps.setString(6, prodBEAN.getData_cad());

            if (ps.executeUpdate() > 0) {
                prodBEAN.setStatus("Produto '" + prodBEAN.getDescricao() + "' inserido com sucesso");
            } else {
                prodBEAN.setStatus("Erro ao inserir");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            prodBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return prodBEAN;
    }

    public List<ProdutoBEAN> consultarDesc(ProdutoBEAN prodBEAN) {
        List<ProdutoBEAN> listaDados = new ArrayList<>();
        String sql = "select * from produto where descricao like ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, "%" + prodBEAN.getDescricao() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    ProdutoBEAN produto = new ProdutoBEAN();
                    produto.setIdProduto(rs.getInt(1));
                    produto.setDescricao(rs.getString(2));
                    produto.setPreco(rs.getDouble(3));
                    produto.setUnidade(rs.getString(4));
                    produto.setQtde_inicial(rs.getDouble(5));
                    produto.setQtde_atual(rs.getDouble(6));
                    produto.setData_cad(rs.getString(7));
                    produto.setStatus("Retorno da consulta:");
                    prodBEAN.setStatus("Retorno da consulta:");
                    listaDados.add(produto);
                }
                if (prodBEAN.getStatus() != "Retorno da consulta:") {
                    prodBEAN.setStatus("Sem resultados para '" + prodBEAN.getDescricao() + "'");
                    prodBEAN.setIdProduto(0);
                    prodBEAN.setDescricao("-");
                    prodBEAN.setPreco(0);
                    prodBEAN.setUnidade("-");
                    prodBEAN.setQtde_inicial(0);
                    prodBEAN.setQtde_atual(0);
                    prodBEAN.setData_cad("-");
                    listaDados.add(prodBEAN);
                }
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            prodBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
            listaDados.add(prodBEAN);
        }
        return listaDados;
    }

    public ProdutoBEAN consultarID(ProdutoBEAN prodBEAN) {
        String sql = "select * from produto where idProduto = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, prodBEAN.getIdProduto());
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    prodBEAN.setIdProduto(rs.getInt(1));
                    prodBEAN.setDescricao(rs.getString(2));
                    prodBEAN.setPreco(rs.getDouble(3));
                    prodBEAN.setUnidade(rs.getString(4));
                    prodBEAN.setQtde_inicial(rs.getDouble(5));
                    prodBEAN.setQtde_atual(rs.getDouble(6));
                    prodBEAN.setData_cad(rs.getString(7));
                    prodBEAN.setStatus("Retorno da pesquisa:");
                }
            }
            if (prodBEAN.getStatus() != "Retorno da pesquisa:") {
                prodBEAN.setStatus("Sem resultados para produto de ID '" + prodBEAN.getIdProduto() + "'");
                prodBEAN.setIdProduto(0);
                prodBEAN.setDescricao("-");
                prodBEAN.setPreco(0);
                prodBEAN.setUnidade("-");
                prodBEAN.setQtde_inicial(0);
                prodBEAN.setQtde_atual(0);
                prodBEAN.setData_cad("-");

            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            prodBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return prodBEAN;
    }

    public ProdutoBEAN alterar(ProdutoBEAN prodBEAN) {
        String sql = "update produto set descricao = ?, preco = ?, unidade = ?,"
                + " qtde_inicial = ?, qtde_atual = ?, data_cad = ?"
                + " where idProduto = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, prodBEAN.getDescricao());
            ps.setDouble(2, prodBEAN.getPreco());
            ps.setString(3, prodBEAN.getUnidade());
            ps.setDouble(4, prodBEAN.getQtde_inicial());
            ps.setDouble(5, prodBEAN.getQtde_atual());
            ps.setString(6, prodBEAN.getData_cad());
            ps.setInt(7, prodBEAN.getIdProduto());

            if (ps.executeUpdate() > 0) {
                prodBEAN.setStatus("Produto '" + prodBEAN.getIdProduto() + "' alterado com sucesso");
            } else {
                prodBEAN.setStatus("Erro ao alterar");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            prodBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return prodBEAN;
    }

    public ProdutoBEAN excluir(ProdutoBEAN prodBEAN) {
        String sql = "delete from produto where idProduto = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, prodBEAN.getIdProduto());
            if (ps.executeUpdate() > 0) {
                prodBEAN.setStatus("Produto '" + prodBEAN.getIdProduto() + "' excluído com sucesso");
            } else {
                prodBEAN.setStatus("Erro ao excluir");
            }
        } catch (SQLException erro) {
            prodBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return prodBEAN;
    }

    public List<ProdutoBEAN> listar() {
        List<ProdutoBEAN> listaDados = new ArrayList<>();
        String sql = "select * from produto";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    ProdutoBEAN produto = new ProdutoBEAN();
                    produto.setIdProduto(rs.getInt(1));
                    produto.setDescricao(rs.getString(2));
                    produto.setPreco(rs.getDouble(3));
                    produto.setUnidade(rs.getString(4));
                    produto.setQtde_inicial(rs.getDouble(5));
                    produto.setQtde_atual(rs.getDouble(6));
                    produto.setData_cad(rs.getString(7));
                    listaDados.add(produto);
                }
            }
        } catch (SQLException erro) {
            ProdutoBEAN produto = new ProdutoBEAN();
            produto.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
            listaDados.add(produto);
        }
        return listaDados;
    }
}
