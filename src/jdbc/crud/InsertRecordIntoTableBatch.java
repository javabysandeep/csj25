package jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordIntoTableBatch {
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

            String query1 = "insert into product values(4,'brain')";
            String query2 = "insert into product values(5,'charger')";
            String query3 = "insert into product values(6,'books')";
            String query4 = "insert into product values(7,'marker')";
            String query5 = "insert into product values(8,'gadgets')";
            //to execute the INSERT, UPDATE, DELETE use: executeUpdate();
            statement.addBatch(query1);
            statement.addBatch(query2);
            statement.addBatch(query3);
            statement.addBatch(query4);
            statement.addBatch(query5);

            int[] recordsInserted = statement.executeBatch();

            System.out.println("records inserted "+recordsInserted.length);


        }catch (SQLException sqlException){
            System.out.println("exception while connecting to the database");
        } finally {
            connection.close();
        }

    }
}
