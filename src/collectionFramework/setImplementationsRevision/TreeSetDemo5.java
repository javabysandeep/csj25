package collectionFramework.setImplementationsRevision;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        //using Comparator
        Student student1 = new Student(11,"xyz");
        Student student2 = new Student(1,"abc");
        Student student3 = new Student(2,"pqrs");
        Student student4 = new Student(30,"efg");
        Student student5 = new Student(4,"mnop");

//        TreeSet<Student> students = new TreeSet<>((s1,s2)->s1.id- s2.id);
//        TreeSet<Student> students = new TreeSet<>(Comparator.comparingInt(s -> s.id));
        TreeSet<Student> students = new TreeSet<>(Comparator.comparing(s -> s.name));
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.forEach(System.out::println);

    }
}
