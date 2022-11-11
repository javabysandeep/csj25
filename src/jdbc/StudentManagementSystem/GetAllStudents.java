package jdbc.StudentManagementSystem;

import java.util.List;

public class GetAllStudents {
    public static void main(String[] args) {
        StudentDaoService service = new StudentDaoService();
        List<Student> allStudents = service.getAllStudents();
        allStudents.forEach(System.out::println);
    }
}
