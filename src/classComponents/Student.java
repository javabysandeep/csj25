package classComponents;

public class Student {
    // instance variable
    int rollNumber;
    String studentName;

    // static variable
    static String collegeName;

    // instance method
    void registerStudent(){
        System.out.println("Student registered ");

    }

    // static method
    public static void main(String[] args) {
        int localVariable = 30;
        System.out.println("Local variable "+localVariable);
    }

}
