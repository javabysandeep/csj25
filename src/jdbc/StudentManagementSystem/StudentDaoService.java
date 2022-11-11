package jdbc.StudentManagementSystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoService {
    //CRUD

    //create
    void createStudent(Student student) {
        // write logic to save the student in the database
        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement statement = connection.createStatement();
            String insertQuery = "insert into student values(" +
                    "'" + student.getStudentId() + "'," +
                    "'" + student.getStudentName() + "'," +
                    "'" + student.getAddress() + "'," +
                    "'" + student.getEmail() + "'," +
                    "'" + student.getPhone() + "'" +
                    ")";
            int executeUpdate = statement.executeUpdate(insertQuery);
            System.out.println("records inserted " + executeUpdate);
            connection.close();
        } catch (SQLException e) {
            System.out.println("error in connection, statement");
        }
    }

    //read
    List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()) {
                Student student = new Student();
                student.setStudentId(resultSet.getString(1));
                student.setStudentName(resultSet.getString(2));
                student.setAddress(resultSet.getString(3));
                student.setEmail(resultSet.getString(4));
                student.setPhone(resultSet.getString(5));

                students.add(student);
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("exception in statement");
        }
        return students;
    }

    //Update
    void updateStudent(Student student) {

    }

    //Delete
    void deleteStudent(String studentId) {

    }


}
