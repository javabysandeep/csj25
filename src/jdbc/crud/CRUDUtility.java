package jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDUtility {
    public static void main(String[] args) throws SQLException {
        System.out.println("-----Operations available-----------");
        System.out.println("-----CREATE new record-----------");
        System.out.println("-----READ-----------");
        System.out.println("-----UPDATE table-----------");
        System.out.println("-----DELETE record-----------");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.next();
        switch (operation){
            case "CREATE":createTable();break;
            case "UPDATE":updateTable();break;
            case "DELETE":deleteTable();break;
            case "READ":readTable();break;
            default:
                System.out.println("invalid operation");
        }
    }

    private static void readTable() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
    }

    private static void deleteTable() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        String query = "delete from product where product_id=1";
    }

    private static void updateTable() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
    }

    private static void createTable() throws SQLException {
        Connection connection = createConnection();
        Statement statement = connection.createStatement();

    }

    private static Connection createConnection() {
        String url="jdbc:mysql://localhost:3306/csj25";
        String username="root";
        String password ="root@1234";
        Connection connection;
        try {
            connection = DriverManager.getConnection(url,username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
