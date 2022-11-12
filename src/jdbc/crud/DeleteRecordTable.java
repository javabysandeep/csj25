package jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecordTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //load the class into the memory & execute static block and register the driver with DriverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //create connection
        Connection connection=null;
        try{
            String url="jdbc:mysql://localhost:3306/csj25";
            String username="root";
            String password ="root@1234";
            connection = DriverManager.getConnection(url,username, password);
            Statement statement = connection.createStatement();
            String query = "delete from product where product_id=2";
            //to execute the INSERT, UPDATE, DELETE use: executeUpdate();
            int i = statement.executeUpdate(query);
            System.out.println("records deleted "+i);


        }catch (SQLException sqlException){
            System.out.println("exception while connecting to the database");
        } finally {
            connection.close();
        }

    }
}
