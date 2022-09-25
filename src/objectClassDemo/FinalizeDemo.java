package objectClassDemo;

public class FinalizeDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student = null;
        System.gc();

    }
}
