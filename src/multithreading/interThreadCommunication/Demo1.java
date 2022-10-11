package multithreading.interThreadCommunication;

public class Demo1 {
    public static void main(String[] args) {
        Message message = new Message();
        Thread sender = new Thread(()->{
            try {
                message.sendMessage();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"sender");
        Thread sender1 = new Thread(()->{
            try {
                message.sendMessage();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"sender1");
        Thread receiver = new Thread(()->{
            try {
                message.receiveMessage();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"receiver");

        sender.start();
        sender1.start();
        receiver.start();
    }
}
