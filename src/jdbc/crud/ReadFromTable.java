package jdbc.crud;

import java.sql.*;

public class ReadFromTable {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
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
            String query = "SELECT *  FROM product";
            //to execute the select query : executeQuery();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getInt("product_id")+"\t"+
                        resultSet.getString("product_name"));
            }


        }catch (SQLException sqlException){
            System.out.println("exception while connecting to the database");
        } finally {
            connection.close();
        }

    }
}
