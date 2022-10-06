package multithreading;

public class MessageTest {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();

        MessageService messageService1 = new MessageService(){
            @Override
            public void sendMessage() {
                System.out.println("anonymous send message");
            }
        };
        messageService1.sendMessage();


        //way 3 : lambda
        MessageService lamdda = ()-> System.out.println("lambda send message");
        lamdda.sendMessage();


    }
}
