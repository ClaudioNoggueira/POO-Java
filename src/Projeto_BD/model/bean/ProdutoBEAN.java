/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.model.bean;

/**
 *
 * @author claud
 */
public class ProdutoBEAN {
    private int idProduto;
    private String descricao, unidade, data_cad, status;
    private double preco, qtde_inicial, qtde_atual;

    public ProdutoBEAN() {
    }

    public ProdutoBEAN(int idProduto) {
        this.idProduto = idProduto;
    }

    public ProdutoBEAN(String descricao) {
        this.descricao = descricao;
    }

    
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getData_cad() {
        return data_cad;
    }

    public void setData_cad(String data_cad) {
        this.data_cad = data_cad;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQtde_inicial() {
        return qtde_inicial;
    }

    public void setQtde_inicial(double qtde_inicial) {
        this.qtde_inicial = qtde_inicial;
    }

    public double getQtde_atual() {
        return qtde_atual;
    }

    public void setQtde_atual(double qtde_atual) {
        this.qtde_atual = qtde_atual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
