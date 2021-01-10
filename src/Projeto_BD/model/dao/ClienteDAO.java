/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.model.dao;

import Projeto_BD.model.bean.ClienteBEAN;
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
public class ClienteDAO {

    private Connection con;

    public ClienteDAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public ClienteBEAN inserir(ClienteBEAN cliBEAN) {
        String sql = "insert into cliente(nome, endereco, bairro, cidade, cep, uf, email, fone, celular)";
        sql += " values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cliBEAN.getNome());
            ps.setString(2, cliBEAN.getEndereco());
            ps.setString(3, cliBEAN.getBairro());
            ps.setString(4, cliBEAN.getCidade());
            ps.setString(5, cliBEAN.getCep());
            ps.setString(6, cliBEAN.getUF());
            ps.setString(7, cliBEAN.getEmail());
            ps.setString(8, cliBEAN.getFone());
            ps.setString(9, cliBEAN.getCelular());

            if (ps.executeUpdate() > 0) {
                cliBEAN.setStatus(cliBEAN.getNome() + " inserido com sucesso");
            } else {
                cliBEAN.setStatus("Erro ao inserir" + cliBEAN.getNome());
            }

        } catch (SQLException erro) {
            cliBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return cliBEAN;
    }

    public ClienteBEAN consultarID(ClienteBEAN cliBEAN) {
        String sql = "select * from cliente where idCliente = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, cliBEAN.getIdCliente());
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    cliBEAN.setIdCliente(rs.getInt(1));
                    cliBEAN.setNome(rs.getString(2));
                    cliBEAN.setEndereco(rs.getString(3));
                    cliBEAN.setBairro(rs.getString(4));
                    cliBEAN.setCidade(rs.getString(5));
                    cliBEAN.setCep(rs.getString(6));
                    cliBEAN.setUF(rs.getString(7));
                    cliBEAN.setEmail(rs.getString(8));
                    cliBEAN.setFone(rs.getString(9));
                    cliBEAN.setCelular(rs.getString(10));
                    cliBEAN.setStatus("Retorno da pesquisa:");
                }
            }
            if (cliBEAN.getStatus() != "Retorno da pesquisa:") {
                cliBEAN.setStatus("Sem resultados para cliente com ID '" + cliBEAN.getIdCliente() + "'");
            }
            ps.close();
        } catch (SQLException erro) {
            cliBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return cliBEAN;
    }

    public List<ClienteBEAN> consultarNome(ClienteBEAN cliBEAN) {
        List<ClienteBEAN> listaDados = new ArrayList<>();
        String sql = "select * from cliente where nome like ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, "%" + cliBEAN.getNome() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    ClienteBEAN cliente = new ClienteBEAN();
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNome(rs.getString(2));
                    cliente.setEndereco(rs.getString(3));
                    cliente.setBairro(rs.getString(4));
                    cliente.setCidade(rs.getString(5));
                    cliente.setCep(rs.getString(6));
                    cliente.setUF(rs.getString(7));
                    cliente.setEmail(rs.getString(8));
                    cliente.setFone(rs.getString(9));
                    cliente.setCelular(rs.getString(10));
                    cliente.setStatus("Retorno da consulta:");
                    cliBEAN.setStatus("Retorno da consulta:");
                    listaDados.add(cliente);
                }
                if (cliBEAN.getStatus() != "Retorno da consulta:") {
                    cliBEAN.setStatus("Sem resultados para '" + cliBEAN.getNome() + "'");
                    cliBEAN.setIdCliente(0);
                    cliBEAN.setNome("-");
                    cliBEAN.setEndereco("-");
                    cliBEAN.setBairro("-");
                    cliBEAN.setCidade("-");
                    cliBEAN.setCep("-");
                    cliBEAN.setUF("-");
                    cliBEAN.setEmail("-");
                    cliBEAN.setFone("-");
                    cliBEAN.setCelular("-");                    
                    listaDados.add(cliBEAN);
                }
                ps.close();
                con.close();
                return listaDados;
            }
        } catch (SQLException erro) {
            cliBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        listaDados.add(cliBEAN);
        return listaDados;
    }

    public ClienteBEAN alterar(ClienteBEAN cliBEAN) {
        String sql = "update cliente set nome = ?, endereco = ?, bairro = ?,"
                + " cidade = ?, cep = ?, uf = ?, email = ?, fone = ?, celular = ?"
                + " where idCliente = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, cliBEAN.getNome());
            ps.setString(2, cliBEAN.getEndereco());
            ps.setString(3, cliBEAN.getBairro());
            ps.setString(4, cliBEAN.getCidade());
            ps.setString(5, cliBEAN.getCep());
            ps.setString(6, cliBEAN.getUF());
            ps.setString(7, cliBEAN.getEmail());
            ps.setString(8, cliBEAN.getFone());
            ps.setString(9, cliBEAN.getCelular());
            ps.setInt(10, cliBEAN.getIdCliente());
            if (ps.executeUpdate() > 0) {
                cliBEAN.setStatus("Registro '" + cliBEAN.getIdCliente() + "' alterado com sucesso.");
            } else {
                cliBEAN.setStatus("Erro ao alterar.");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            cliBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return cliBEAN;
    }

    public ClienteBEAN excluir(ClienteBEAN cliBEAN) {
        String sql = "delete from cliente where idCliente = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, cliBEAN.getIdCliente());
            if (ps.executeUpdate() > 0) {
                cliBEAN.setStatus("Registro '" + cliBEAN.getIdCliente() + "' excluído com sucesso.");
            } else {
                cliBEAN.setStatus("Erro ao excluír.");
            }
            ps.close();
            con.close();
        } catch (SQLException erro) {
            cliBEAN.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
        }
        return cliBEAN;
    }

    public List<ClienteBEAN> listar() {
        List<ClienteBEAN> listaDados = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    ClienteBEAN cliente = new ClienteBEAN();
                    cliente.setIdCliente(rs.getInt(1));
                    cliente.setNome(rs.getString(2));
                    cliente.setEndereco(rs.getString(3));
                    cliente.setBairro(rs.getString(4));
                    cliente.setCidade(rs.getString(5));
                    cliente.setCep(rs.getString(6));
                    cliente.setUF(rs.getString(7));
                    cliente.setEmail(rs.getString(8));
                    cliente.setFone(rs.getString(9));
                    cliente.setCelular(rs.getString(10));
                    cliente.setStatus("Retorno da consulta: ");
                    listaDados.add(cliente);
                }
            }
        } catch (SQLException erro) {
            ClienteBEAN cliente = new ClienteBEAN();
            cliente.setStatus("Erro nº" + erro.getErrorCode() + "\n" + erro.getMessage());
            listaDados.add(cliente);
        }
        return listaDados;
    }
}
