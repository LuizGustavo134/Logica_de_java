package AppSwing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() {
        Connection conn = null;
        try {
            // Carrega o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Dados do banco
            String url = "jdbc:mysql://localhost:3306/teste_db?useSSL=false&serverTimezone=UTC";
            String usuario = "root";
            String senha = ""; // deixe vazio se não tiver senha

            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("✅ Conectado com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver JDBC não encontrado!");
        } catch (SQLException e) {
            System.out.println("❌ Erro ao conectar: " + e.getMessage());
        }
        return conn;
    }
}
