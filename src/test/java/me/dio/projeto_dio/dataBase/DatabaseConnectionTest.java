package me.dio.projeto_dio.dataBase;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;


public class DatabaseConnectionTest {

    @Test
    void testConnection() {
        String url = "jdbc:mysql://localhost:3307/projeto_dio";
        String user = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try (Connection connection = DriverManager.getConnection(url, user, password)){
            assertNotNull(connection);
            System.out.println("conexão bem-sucedida!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
