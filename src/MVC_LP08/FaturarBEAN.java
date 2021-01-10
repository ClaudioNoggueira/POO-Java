/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_LP08;

/**
 *
 * @author claud
 */
public class FaturarBEAN {

    private int numItem;
    private String descricao, data_adicao;
    private float qtde = 0, preco;

    public FaturarBEAN() {
        numItem = 0;
        descricao = "";
        qtde = 0;
        preco = 0;
    }

    public FaturarBEAN(int numItem, String descricao, float qtde, float preco) {
        this.numItem = numItem;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_adicao() {
        return data_adicao;
    }

    public void setData_adicao(String data_adicao) {
        this.data_adicao = data_adicao;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
