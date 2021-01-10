/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_LP04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class LP0405_DAO {
    private Connection con;

    public LP0405_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public LP0405_BEAN inserirNumeros(LP0405_BEAN exBEAN){
        String sql = " Insert Into LP0405(valor1, valor2, maior) Values(?,?,?) ";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setDouble(1, exBEAN.getValor1());
            ps.setDouble(2, exBEAN.getValor2());
            ps.setDouble(3, exBEAN.getMaior());
            
            if(ps.executeUpdate() > 0){
                System.out.println("Inserido com sucesso.");
                return exBEAN;
            }else{
                System.out.println("Erro ao inserir");
                return exBEAN;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return exBEAN;
        }
    }
    public List<LP0405_BEAN> listarNumeros(){
        List<LP0405_BEAN> listaDeNumeros = new ArrayList<LP0405_BEAN>();
        String sql = "Select valor1, valor2, maior From LP0405";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                        LP0405_BEAN exBEAN = new LP0405_BEAN();
                        exBEAN.setValor1(rs.getDouble(1));
                        exBEAN.setValor2(rs.getDouble(2));
                        exBEAN.setMaior(rs.getDouble(3));
                        listaDeNumeros.add(exBEAN);
                }
                return listaDeNumeros;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
