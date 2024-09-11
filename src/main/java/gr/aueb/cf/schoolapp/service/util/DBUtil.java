package gr.aueb.cf.schoolapp.service.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {
    private static BasicDataSource ds = new BasicDataSource();
    private static Connection conn = null;

    static{
        ds.setUrl("jdbc:mysql://localhost:3306/myschool6db?serverTimezone=UTC");
        ds.setUsername("mydbuser6");
        ds.setPassword(System.getenv("PASS_DB6"));
        ds.setInitialSize(10);
        ds.setMaxTotal(100);
        ds.setMinIdle(10);
        ds.setMaxIdle(10);
    }

    private DBUtil() {}

    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = ds.getConnection();
            return conn;
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
