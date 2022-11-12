package jdbc.crud;

import java.sql.*;
import java.util.Scanner;

public class InsertRecordIntoTableDynamic {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection=null;
        try{
            //accept the values from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the product id and product name");
            int productId = scanner.nextInt();
            String productName = scanner.next();

            String url="jdbc:mysql://localhost:3306/csj25";
            String username="root";
            String password ="root@1234";
            connection = DriverManager.getConnection(url,username, password);
            String query = "insert into product values(?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,productId);
            preparedStatement.setString(2,productName);
            int insert = preparedStatement.executeUpdate();


            System.out.println("records inserted "+insert);
        }catch (SQLException sqlException){
            System.out.println("exception while connecting to the database");
        } finally {
            connection.close();
        }

    }
}
