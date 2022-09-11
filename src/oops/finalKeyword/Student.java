package oops.finalKeyword;

public final class Student {
   private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }
}

class A {
 void m1(){
     System.out.println("m1");
 }
 static final void m2(){
     System.out.println("m2");
 }
}

class B extends A {
    @Override
    void m1() {
        System.out.println("m1 overriden");
    }
}
