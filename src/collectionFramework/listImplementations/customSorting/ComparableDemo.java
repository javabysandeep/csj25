package collectionFramework.listImplementations.customSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        Student student1 = new Student(101,"abc",78);
        Student student2 = new Student(1,"xyz",36);
        Student student3 = new Student(102,"pqr",98);
        Student student4 = new Student(2,"mnq",87);
        Student student5 = new Student(13,"efgh",37);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        //printing list of students
//        students.forEach((student)-> System.out.println(student));
        /*for (Student s:students) {
            System.out.println(s);
        }*/
        /*for (int index = 0; index < students.size(); index++) {
            System.out.println(students.get(index));
        }*/
        students.forEach(System.out::println);

        System.out.println("After sorting");

        Collections.sort(students);

        students.forEach(System.out::println);
    }
}
