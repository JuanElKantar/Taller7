package co.edu.sena.project_2687365.connection_test;
import java.sql.*;
public class BasicConnectionSingleton {
    private static String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Bogota";
    private static String user = "juan1";
    private static String pass = "3169648Aa";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
} // BasicConnectionSingleton