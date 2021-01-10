/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.control;

import Projeto_BD.model.bean.PedidoBEAN;
import Projeto_BD.model.dao.PedidoDAO;
import Projeto_BD.util.Conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claud
 */
public class PedidoControl {

    private Connection con = Conexao.abrirConexao();
    PedidoDAO pedDAO = new PedidoDAO(con);

    public PedidoBEAN inserir(PedidoBEAN pedBEAN) {
        return pedDAO.inserir(pedBEAN);
    }

    public PedidoBEAN consultarID(PedidoBEAN pedBEAN) {
        return pedDAO.consultarID(pedBEAN);
    }

    public List<PedidoBEAN> consultarData(PedidoBEAN pedBEAN) {
        List<PedidoBEAN> listaDados = new ArrayList<>();
        listaDados = pedDAO.consultarData(pedBEAN);
        return listaDados;
    }

    public PedidoBEAN alterar(PedidoBEAN pedBEAN) {
        return pedDAO.alterar(pedBEAN);
    }

    public PedidoBEAN excluir(PedidoBEAN pedBEAN) {
        return pedDAO.excluir(pedBEAN);
    }

    public List<PedidoBEAN> listar() {
        List<PedidoBEAN> listaDados = new ArrayList<>();
        listaDados = pedDAO.listar();
        return listaDados;
    }
}
