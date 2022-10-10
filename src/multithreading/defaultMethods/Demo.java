package multithreading.defaultMethods;

public class Demo {
    public static void main(String[] args) {
        I1 i1 = new Impl();
        i1.m1();
    }
}
interface I1{
    default void m1(){
        System.out.println("m1 method of I1");
    }
}
interface I2{
    default void m1(){
        System.out.println("m1 method of I2");
    }
}
class Impl implements I1,I2{

    @Override
    public void m1() {
        I1.super.m1();
        I2.super.m1();
        System.out.println("overriden method");
    }
}
