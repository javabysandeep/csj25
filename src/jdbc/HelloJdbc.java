package jdbc;

import java.sql.*;

public class HelloJdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //pre-requisite to the connection:
        // 1. load the Driver class into the memory
        //2. static block will register the driver class obj with DriverManager
        //this line is required before java 7
        Class.forName("com.mysql.cj.jdbc.Driver");
        //DriverManager.registerDriver(new Driver());

        // what is driver : it is implementation provided by vendor for the interface java.sql.Driver
        //Driver driver = new com.mysql.cj.jdbc.Driver(); // this gives the connection

        //steps to connect to Database from Jav application
        //Java App ---> DriverManager ---> Driver----> Database

        String url = "jdbc:mysql://localhost:3306/csj25";
        String username = "root";
        String password = "root@1234";
        //get the connection
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        //execute the query
        ResultSet resultSet = statement.executeQuery("select * from student");
        //get the result

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("name") + "\t" +
                    resultSet.getString("address"));
        }

        //close connection
        connection.close();
    }
}
