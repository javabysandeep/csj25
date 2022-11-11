package jdbc.StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateStudentRecordRefactor {
    public static void main(String[] args) throws SQLException {
        //accept student details from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the student record");
        String studentId = scanner.next();
        String studentName = scanner.next();
        String address = scanner.next();
        String email = scanner.next();
        String phone = scanner.next();

        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentName(studentName);
        student.setAddress(address);
        student.setEmail(email);
        student.setPhone(phone);

        StudentDaoService service = new StudentDaoService();
        service.createStudent(student);

    }
}
