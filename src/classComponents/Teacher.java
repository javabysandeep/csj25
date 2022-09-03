package classComponents;

public class Teacher {
    int teacherId;
    String teacherName;
    static String instituteName = "cyber";

    /*Teacher(){
           System.out.println("zero param ");
           teacherId = 1;
           teacherName="sandeep";
    }*/

    public void registerTeacher() {
        System.out.println("Teacher registered ");
    }

    public Teacher(int teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    static String getInstituteName() {
        return instituteName;
    }

    public static void main(String[] args) {
        String instituteName = "pune university";
        Teacher teacher = new Teacher(1,"abc");
        System.out.println(teacher.teacherId);
        System.out.println(teacher.teacherName);
        System.out.println("Local " + instituteName);
        System.out.println("Static " + Teacher.instituteName);
        teacher.registerTeacher();
        System.out.println(Teacher.getInstituteName());
        Teacher teacher1 = new Teacher(2,"xyz");
        Teacher teacher2 = new Teacher(3,"pqr");
        System.out.println(teacher1.teacherId + "\t" + teacher1.teacherName);
        System.out.println(teacher2.teacherId + "\t" + teacher2.teacherName);

    }
}
