/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.control;

import Projeto_BD.util.Conexao;
import Projeto_BD.model.bean.ClienteBEAN;
import Projeto_BD.model.dao.ClienteDAO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claud
 */
public class ClienteControl {

    Connection con = Conexao.abrirConexao();
    ClienteDAO cliDAO = new ClienteDAO(con);

    public ClienteBEAN inserir(ClienteBEAN cliBEAN) {
        return cliDAO.inserir(cliBEAN);
    }

    public ClienteBEAN consultarID(ClienteBEAN cliBEAN) {
        return cliDAO.consultarID(cliBEAN);
    }

    public List<ClienteBEAN> consultarNome(ClienteBEAN cliBEAN) {
        List<ClienteBEAN> listaDados = new ArrayList<>();
        listaDados = cliDAO.consultarNome(cliBEAN);
        return listaDados;
    }

    public ClienteBEAN alterar(ClienteBEAN cliBEAN) {
        return cliDAO.alterar(cliBEAN);
    }

    public ClienteBEAN excluir(ClienteBEAN cliBEAN) {
        return cliDAO.excluir(cliBEAN);
    }

    public List<ClienteBEAN> listar() {
        List<ClienteBEAN> listaDados = new ArrayList<>();
        listaDados = cliDAO.listar();
        return listaDados;
    }
}
