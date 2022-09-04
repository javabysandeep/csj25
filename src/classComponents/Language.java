package classComponents;

public class Language {
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {

    }
}

/*
* 1. JVM will be started
* 2. main thread will be created
* 3. class is located
* 4. class is loaded into the memory [ static variables will get the memory]
* 5. static block and main method will be executed
* 6. main method and static block is complete
* 7. class is unloaded from the memory [ static variables will be removed from the memory]
* 8. main thread stops
* 9. JVM is shutdown.
* */










