package web.customer.data;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DbConnection {
    private static final String JDBC_URL =
            "jdbc:mysql://localhost:3306/customer_control_jakarta?useSSL=false&" +
                    "useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDB_USER = "root";
    private static final String JDBC_PASSWORD = "";
    private static BasicDataSource dataSource;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDB_USER);
            dataSource.setPassword(JDBC_PASSWORD);
            dataSource.setInitialSize(10); // Init with 10 connections
            dataSource.setMaxTotal(50); // Max 50 connections
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}
