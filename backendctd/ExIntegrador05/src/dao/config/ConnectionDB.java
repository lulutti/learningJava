package dao.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {
    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
