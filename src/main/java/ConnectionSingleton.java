
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.MissingResourceException;

public class ConnectionSingleton {

    private Connection conexao;

    private String url = "jdbc:mysql://localhost/showtime";
    private String user = "admin";
    private String password = "";

    private static ConnectionSingleton instance;

    private ConnectionSingleton() throws SQLException, MissingResourceException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
        } catch(Exception e) {
            throw new MissingResourceException("Driver não encontrado", "com.mysql.jdbc.Driver", "MySql");
        }

        try {
            this.conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao ok");
        } catch(SQLException e) {
            throw new SQLException("Não foi possível conectar ao banco de dados");
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static ConnectionSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConnectionSingleton();
        }
        return instance;
    }

    public Connection getConexao(){
        return this.conexao;
    }
}
