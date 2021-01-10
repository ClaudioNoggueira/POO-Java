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
import MVC_LP04.LP0401_BEAN;

/**
 *
 * @author claud
 */
public class LP0401_DAO {

    private Connection con;

    public LP0401_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public LP0401_BEAN inserirNumero(LP0401_BEAN exBEAN) {
        String sql = "INSERT INTO lp04_01(valor, dobro) VALUES(?, ?) ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, exBEAN.getEntrada());
            ps.setInt(2, exBEAN.getDobro());

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
    public List<LP0401_BEAN> listar(){
        String sql = "Select valor, dobro From lp04_01";
        List<LP0401_BEAN> listaNumeros = new ArrayList<LP0401_BEAN>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    LP0401_BEAN exBEAN = new LP0401_BEAN();
                    exBEAN.setEntrada(rs.getInt(1));
                    exBEAN.setDobro(rs.getInt(2));
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
