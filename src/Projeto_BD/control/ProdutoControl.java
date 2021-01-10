/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.control;

import Projeto_BD.util.Conexao;
import Projeto_BD.model.bean.ProdutoBEAN;
import Projeto_BD.model.dao.ProdutoDAO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claud
 */
public class ProdutoControl {

    private Connection con = Conexao.abrirConexao();
    ProdutoDAO prodDAO = new ProdutoDAO(con);

    public ProdutoBEAN inserir(ProdutoBEAN prodBEAN) {
        return prodDAO.inserir(prodBEAN);
    }

    public List<ProdutoBEAN> consultarDesc(ProdutoBEAN prodBEAN) {
        List<ProdutoBEAN> listaDados = new ArrayList<>();
        listaDados = prodDAO.consultarDesc(prodBEAN);
        return listaDados;
    }

    public ProdutoBEAN consultarID(ProdutoBEAN prodBEAN) {
        return prodDAO.consultarID(prodBEAN);
    }

    public ProdutoBEAN alterar(ProdutoBEAN prodBEAN) {
        return prodDAO.alterar(prodBEAN);
    }

    public ProdutoBEAN excluir(ProdutoBEAN prodBEAN) {
        return prodDAO.excluir(prodBEAN);
    }

    public List<ProdutoBEAN> listar() {
        List<ProdutoBEAN> listaDados = new ArrayList<>();
        listaDados = prodDAO.listar();
        return listaDados;
    }
}
