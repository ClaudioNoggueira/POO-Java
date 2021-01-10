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
class LP0408_DAO {

    private Connection con;

    public LP0408_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public LP0408_BEAN adicionarDados(LP0408_BEAN exBEAN) {
        String sql = " Insert into LP0408(numero, ehPrimo) values(?,?) ";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, exBEAN.getNumero());
            ps.setBoolean(2, exBEAN.isPrimo());

            if (ps.executeUpdate() > 0) {
                System.out.println("Adicionado com sucesso.");
                return exBEAN;
            }else{
                System.out.println("Erro ao adicionar.");
                return exBEAN;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return exBEAN;
        }
    }
    public List<LP0408_BEAN> listarDados(){
        List<LP0408_BEAN> listaDeDados = new ArrayList<LP0408_BEAN>();
        String sql = " Select numero, ehPrimo From LP0408 ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    LP0408_BEAN exBEAN = new LP0408_BEAN();
                    exBEAN.setNumero(rs.getInt(1));
                    exBEAN.setPrimo(rs.getBoolean(2));
                    listaDeDados.add(exBEAN);
                }
                return listaDeDados;
            }else{
                return null;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
