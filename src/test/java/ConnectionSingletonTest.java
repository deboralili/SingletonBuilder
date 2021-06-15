import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionSingletonTest {

    @Test
    void deveRetornarUser() {
        String user = null;
        try {
            user = ConnectionSingleton.getInstance().getUser();
            assertEquals("admin", user);
        } catch (SQLException throwables) {
            fail();
        }
    }

}