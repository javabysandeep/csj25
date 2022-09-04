package classComponents;

public class PlayMusic {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            for (int i = 100; i <1000 ; i++) {
                System.out.println("playing music "+i);
                System.out.println(Thread.currentThread().getName());
            }
        },"music");
        thread.start();


        for (int i = 1; i <100 ; i++) {
            System.out.println("playing music ");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
