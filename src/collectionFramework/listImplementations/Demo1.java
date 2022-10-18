package collectionFramework.listImplementations;

import fileHandling.Student;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        Student[] students = new Student[5];
        students[0]= student1;
        students[1]= student2;
        students[2]= student3;
        students[3]= student4;
        students[4]= student5;
        m2(students);
        m1(student1,student2,student3,student4,student5);

        ArrayList arrayList = new ArrayList();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        m3(arrayList);
    }

    private static void m3(ArrayList arrayList) {
    }

    private static void m2(Student[] students) {
    }

    private static void m1(Student student1, Student student2, Student student3, Student student4, Student student5) {
    }
}
