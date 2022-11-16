package jdbc;

import java.sql.*;

public class CallableDemo {
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
        //call the stored procedure from the database
        String query = "CREATE PROCEDURE product_proc() BEGIN\n" +
                "\tinsert into product(product_id, product_name)values(2,'p');\n" +
                "\tinsert into product(product_id, product_name)values(3,'q');\n" +
                "\tinsert into product(product_id, product_name)values(4,'r');\n" +
                "\tinsert into product(product_id, product_name)values(5,'m');\n" +
                "\tinsert into product(product_id, product_name)values(6,'n');\n" +
                "\tinsert into product(product_id, product_name)values(7,'o');\n" +
                "\tinsert into product(product_id, product_name)values(8,'p');\n" +
                "    \n" +
                "END;";

        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();
        System.out.println("stored procedure created");
        //close connection
        connection.close();
    }
}
