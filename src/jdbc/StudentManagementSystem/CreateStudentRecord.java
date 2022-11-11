package jdbc.StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateStudentRecord {
    public static void main(String[] args) throws SQLException {
        //accept student details from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the student record");
        String studentId = scanner.next();
        String studentName = scanner.next();
        String address = scanner.next();
        String email = scanner.next();
        String phone = scanner.next();


        //step1 : get the connection
        String url = "jdbc:mysql://localhost:3306/csj25";
        String username = "root";
        String password = "root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String insertQuery = "insert into student values(" +
                "'" +studentId+ "'," +
                "'" +studentName+ "'," +
                "'" +address+ "'," +
                "'" +email+ "'," +
                "'" +phone+ "'" +
                ")";
        int recordsInserted = statement.executeUpdate(insertQuery);
        System.out.println("records inserted successfully "+recordsInserted);
        connection.close();
    }
}
