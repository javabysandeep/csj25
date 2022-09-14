package questions;

public class ImmutableClass {
    private int number;

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(100);
        student.setName("abc");
        Student student1 = student;
        student1.setId(1);
        student1.setName("changed");
        Student student2 = student;
        Student student3 = student;
        Student student4 = student;
        Student student5 = student;
        Student student6 = student;
        Student student7 = student;
        Student student8 = student;
        Student student9 = student;
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);
        System.out.println(student9);
        //country field which all students : India -- 10 bytes

        String str = "India";
        String str2 = "India";

    }
}

class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}