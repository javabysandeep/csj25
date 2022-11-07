package helloWorld;

public class TestComponents {
    public static void main(String[] args) {
        ClassComponents classComponents = new ClassComponents();
        System.out.println(classComponents.instanceVariable);
        System.out.println(ClassComponents.staticVariable);
        classComponents.instanceMethod();
        ClassComponents.staticMethod();
        int a = 300;
        System.out.println("Local variable "+a);
    }
}
