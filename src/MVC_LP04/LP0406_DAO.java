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

/**
 *
 * @author claud
 */
public class LP0406_DAO {

    private Connection con;

    public LP0406_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public LP0406_BEAN inserirValores(LP0406_BEAN exBEAN) {
        String sql = " Insert Into LP0406(mes, mesString) Values(?,?) ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, exBEAN.getMes());
            ps.setString(2, exBEAN.getMesString());
            
            if(ps.executeUpdate() >0){
                System.out.println("Inserido com sucesso");
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
    public List<LP0406_BEAN> listarDados(){
        List<LP0406_BEAN> listaDeDados = new ArrayList<LP0406_BEAN>();
        String sql = " Select mes, mesString From LP0406 ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                   LP0406_BEAN exBEAN = new LP0406_BEAN();
                   exBEAN.setMes(rs.getInt(1));
                   exBEAN.setMesString(rs.getString(2));
                   listaDeDados.add(exBEAN);
                }
                return listaDeDados;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
}
