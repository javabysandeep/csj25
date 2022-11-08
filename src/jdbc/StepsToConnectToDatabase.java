package jdbc;

import java.sql.*;

public class StepsToConnectToDatabase {
    public static void main(String[] args) throws SQLException {
        // step 1. create the project
        // step 2. add the mysql to the project
        // step 3. Establish connection between Java App and Database Server
        String url="jdbc:mysql://localhost:3306/cyber_success";
        String username ="root";
        String password ="root@1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "select * from student";
        Statement statement = connection.createStatement();

        //execute the query
        ResultSet resultSet = statement.executeQuery(query);

        //read the result
        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2));
        }

        // connection close
        connection.close();


    }
}
