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
import MVC_LP04.Conexao;

/**
 *
 * @author claud
 */
public class LP0402_DAO {

    private Connection con;

    public LP0402_DAO(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public LP0402_BEAN inserirNumeros(LP0402_BEAN exBEAN) {
        String sql = "Insert Into LP0402(nota1, nota2, nota3, nota4, mediaA) Values(?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setDouble(1, exBEAN.getNota1());
            ps.setDouble(2, exBEAN.getNota2());
            ps.setDouble(3, exBEAN.getNota3());
            ps.setDouble(4, exBEAN.getNota4());
            ps.setDouble(5, exBEAN.getMediaA());

            if (ps.executeUpdate() > 0) {
                System.out.println("Inserido com sucesso");
                return exBEAN;
            }else{
                System.out.println("Erro ao inserir");
                return exBEAN;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return exBEAN;
        }
    }
    
    public List<LP0402_BEAN> listarValores(){
        List<LP0402_BEAN> listaValores = new ArrayList<LP0402_BEAN>();
        String sql = "Select nota1, nota2, nota3, nota4, mediaA From LP0402";
        try{
            PreparedStatement ps = Conexao.abrirConexao().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            if(rs != null){
               while(rs.next()){
                   LP0402_BEAN exBEAN = new LP0402_BEAN();
                   exBEAN.setNota1(rs.getDouble(1));
                   exBEAN.setNota2(rs.getDouble(2));
                   exBEAN.setNota3(rs.getDouble(3));
                   exBEAN.setNota4(rs.getDouble(4));
                   exBEAN.setMediaA(rs.getDouble(5));
                   listaValores.add(exBEAN);
               }
               return listaValores;
            }else{
                return null;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
