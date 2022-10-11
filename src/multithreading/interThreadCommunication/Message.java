package multithreading.interThreadCommunication;

public class Message {
    synchronized void sendMessage() throws InterruptedException {
        System.out.println("message sent");
      wait();
        System.out.println("message confirmed");
    }
   synchronized void receiveMessage() throws InterruptedException {
       System.out.println("message received");
       notifyAll();
    }
}
