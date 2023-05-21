package co.edu.sena.project_2687365.connection_test;
import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.*;
public class ConnectionPool {
    private static String url ="jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Bogota";
    private static String user = "juan1";
    private static String pass = "3169648Aa";
    private static BasicDataSource pool;
    public static BasicDataSource
    getInstance() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);
            pool.setInitialSize(5);
            pool.setMinIdle(5);
            pool.setMaxIdle(10);
            pool.setMaxTotal(10);
        }
        return pool;
    }
    public static Connection getConnection()
            throws SQLException{
        return getInstance().getConnection();
    }
} // ConnectionPool