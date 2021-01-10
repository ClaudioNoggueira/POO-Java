/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author claud
 */
public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/POO?";
            url += "user=root&password=root";

            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        } catch (ClassNotFoundException erro) {
            System.out.println(erro.getMessage());
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
        return con;
    }

    public static void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada");
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
}
