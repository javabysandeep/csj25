package collectionFramework.setImplementationsRevision;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        //using Comparable
        Student student1 = new Student(11,"xyz");
        Student student2 = new Student(1,"abc");
        Student student3 = new Student(2,"pqrs");
        Student student4 = new Student(30,"efg");
        Student student5 = new Student(4,"mnop");
        //30,40,1,50
        //30, 1,40, 50
        //1,30,40,50
        TreeSet<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.forEach(System.out::println);

    }
}
