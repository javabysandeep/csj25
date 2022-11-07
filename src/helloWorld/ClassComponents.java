package helloWorld;

public class ClassComponents {
    int instanceVariable = 100;
    static int staticVariable = 200;
    void instanceMethod(){
        System.out.println("instance method");
    }
    static void staticMethod(){
        System.out.println("static method");
    }

    public ClassComponents() {
        System.out.println("zero param");
    }

    public ClassComponents(int instanceVariable) {
        this.instanceVariable = instanceVariable;
        System.out.println("param con");
    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    class InnerClass {
        //non-static members
    }
    static class StaticNestedClass{

    }

}
