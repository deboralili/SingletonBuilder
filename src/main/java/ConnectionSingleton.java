import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionSingleton {

    private Connection conexao;

    private String url = "jdbc:mysql://localhost/showtime";
    private String user = "admin";
    private String password = "";

    private static ConnectionSingleton instance;

    private ConnectionSingleton(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
        } catch(Exception e) {
            System.out.println("Driver não encontrado");
        }

        try {
            this.conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao ok");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ConnectionSingleton getInstance(){
        if (instance == null) {
            instance = new ConnectionSingleton();
        }
        return instance;
    }

    public Connection getConexao(){
        return this.conexao;
    }
}
