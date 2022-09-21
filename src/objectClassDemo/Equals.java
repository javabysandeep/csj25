package objectClassDemo;

public class Equals {
    public static void main(String[] args) {
        int a = 10;
        int b = 17;
        System.out.println(a == b);
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");
        System.out.println(student1 == student2);//false
        System.out.println(student1.equals(student2));//false
        //equals method from object class does the reference check
        // we recommend using == for primitives and equals method for referecnes
    }
}
