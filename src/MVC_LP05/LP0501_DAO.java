/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_LP05;

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
class LP0501_DAO {

    private Connection con;

    public LP0501_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    public LP0501_BEAN inserir(LP0501_BEAN exBEAN){
        String sql = "Insert Into LP0501(base, altura, areaT, data_adicao) values(?,?,?,?)";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setFloat(1, exBEAN.getBase());
            ps.setFloat(2, exBEAN.getAltura());
            ps.setFloat(3, exBEAN.getAreaT());
            ps.setString(4, exBEAN.getData());
            if(ps.executeUpdate()>0){
                System.out.println("Inserido com sucesso.");
            }else{
                System.out.println("Erro ao inserir.");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exBEAN;
    }
    public List<LP0501_BEAN> listar(){
        List<LP0501_BEAN> lista_de_dados = new ArrayList<LP0501_BEAN>();
        String sql = "Select base, altura, areaT, data_adicao from LP0501";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while(rs.next()){
                    LP0501_BEAN exBEAN = new LP0501_BEAN();
                    exBEAN.setBase(rs.getInt(1));
                    exBEAN.setAltura(rs.getInt(2));
                    exBEAN.setAreaT(rs.getInt(3));
                    exBEAN.setData(rs.getString(4));
                    lista_de_dados.add(exBEAN);
                }
                return lista_de_dados;
            }else{
                return null;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
