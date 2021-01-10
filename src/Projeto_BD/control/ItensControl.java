/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.control;


import Projeto_BD.model.bean.ItensBEAN;
import Projeto_BD.model.dao.ItensDAO;
import Projeto_BD.util.Conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claud
 */
public class ItensControl {

    private Connection con = Conexao.abrirConexao();
    ItensDAO itensDAO = new ItensDAO(con);

    public ItensBEAN inserir(ItensBEAN itensBEAN) {
        return itensDAO.inserir(itensBEAN);
    }

    public ItensBEAN consultarID(ItensBEAN itensBEAN) {
        return itensDAO.consultarID(itensBEAN);
    }

    public ItensBEAN alterar(ItensBEAN intesBEAN) {
        return itensDAO.alterar(intesBEAN);
    }

    public ItensBEAN excluir(ItensBEAN itensBEAN) {
        return itensDAO.excluir(itensBEAN);
    }

    public List<ItensBEAN> listar() {
        List<ItensBEAN> listaDados = new ArrayList<>();
        listaDados = itensDAO.listar();
        return listaDados;
    }
}
