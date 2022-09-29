package array;

public class Demo16MultiDimensional {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (Student student:students) {
            System.out.println(student);
        }
        students[0] = new Student(1,"john");
        students[1] = new Student(2,"sam");
        students[2] = new Student(3,"akash");
        students[3] = new Student(4,"ganesh");
        students[4] = new Student(5,"danny");
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
