import java.sql.Connection;

public class Main {

    public void Main() {
    }

    public static void main (String[] args) {
        ConnectionSingleton singleton = ConnectionSingleton.getInstance();
        Connection conexao = singleton.getConexao();
    }
}
