package oops.polymorphism;

public class MessageTest {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("Hello");
    }
}
