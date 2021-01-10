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

public class LP0407_DAO {

    private Connection con;

    public LP0407_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public LP0407_BEAN inserirValores(LP0407_BEAN exBEAN) {
        String sql = " Insert into LP0407(numero, equacao, fatorial) Values(?,?,?) ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, exBEAN.getNumero());
            ps.setString(2, exBEAN.getEquacoes());
            ps.setInt(3, exBEAN.getFatorial());

            if (ps.executeUpdate() > 0) {
                System.out.println("Inserido com sucesso");
                return exBEAN;
            } else {
                System.out.println("Erro ao inserir");
                return exBEAN;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return exBEAN;
        }
    }
    public List<LP0407_BEAN> listarValores(){
        List<LP0407_BEAN> listaDeValores = new ArrayList<LP0407_BEAN>();
        String sql = "Select numero, equacao, fatorial From LP0407";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    LP0407_BEAN exBEAN = new LP0407_BEAN();
                    exBEAN.setNumero(rs.getInt(1));
                    exBEAN.setEquacoes(rs.getString(2));
                    exBEAN.setFatorial(rs.getInt(3));
                    listaDeValores.add(exBEAN);
                }
                return listaDeValores;
            }else{
                return null;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
        
    }
}
