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
public class PedidoBEAN {

    private int idPedido, idCliente;
    private String data_pedido, status;

    public PedidoBEAN() {
    }

    public PedidoBEAN(int idPedido) {
        this.idPedido = idPedido;
    }

    public PedidoBEAN(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
