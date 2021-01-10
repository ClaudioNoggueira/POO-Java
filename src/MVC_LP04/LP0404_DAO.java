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


public class LP0404_DAO {
    private Connection con;

    public LP0404_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public LP0404_BEAN inserirNumeros(LP0404_BEAN exBEAN){
        String sql = " Insert Into LP0404(grau, radiano) Values(?,?) ";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            ps.setFloat(1, exBEAN.getGrau());
            ps.setFloat(2, exBEAN.getRadiano());
            
            if(ps.executeUpdate()>0){
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
    public List<LP0404_BEAN> listarNumeros(){
        String sql = "Select grau, radiano From LP0404";
        List<LP0404_BEAN> listaNumeros = new ArrayList<LP0404_BEAN>();
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    LP0404_BEAN exBEAN = new LP0404_BEAN();
                    exBEAN.setGrau(rs.getFloat(1));
                    exBEAN.setRadiano(rs.getFloat(2));
                    listaNumeros.add(exBEAN);
                }
                return listaNumeros;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
}
