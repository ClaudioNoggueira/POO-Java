package MVC_LP08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class Conexao {

    static Connection abrirConexao() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "";
            url += "jdbc:mysql://127.0.0.1/POO?";
            url += "user=root&password=root";

            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    void fecharConexao(Connection con) {
        try {
            con.close();
            System.out.println("Conexão fechada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
