package jdbc.StudentManagementSystem;

public class StudentController {
    public static void main(String[] args) {
        StudentDaoService service = new StudentDaoService();
        Student student = new Student();
        student.setStudentId("2");
        student.setStudentName("pqr");
        student.setEmail("pqr@gmail.com");
        student.setAddress("pune");
        student.setPhone("9912345");

        service.createStudent(student);

    }
}
