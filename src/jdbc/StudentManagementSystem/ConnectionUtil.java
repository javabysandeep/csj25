package jdbc.StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    public static Connection connection;
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/csj25";
        String username = "root";
        String password = "root@1234";
        try {
            connection = DriverManager.getConnection(url, username,password);
        } catch (SQLException e) {
            System.out.println("failed to connect to the database");
        }
        return  connection;
    }
}
