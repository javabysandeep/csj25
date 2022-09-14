package questions;

public abstract class MessageService {
    abstract void send();
    MessageService(){
        System.out.println("MessageService constructor");
    }
}
