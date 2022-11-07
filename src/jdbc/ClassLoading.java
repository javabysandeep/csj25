package jdbc;

public class ClassLoading {

    public static void main(String[] args) throws ClassNotFoundException {
        //1. create the object and load the class
        // problem is constructor confusion
       // Demo demo = new Demo();

        //2. use Class.forName to load the class into the memory
        Class.forName("jdbc.Demo");
    }
}
class Demo {
    Demo(int a){}
    static {
        System.out.println("this will be executed once the class is loaded");
    }
}
