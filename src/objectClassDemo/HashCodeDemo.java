package objectClassDemo;

public class HashCodeDemo {
    public static void main(String[] args) {
        Student student1 = new Student(1, "abc");
        Student student2 = new Student(1, "abc");
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        int a = 100;
        int b = 100;

        System.out.println(a == b);
        System.out.println(student1==student2);//false: reference check



    }
}
