package helloWorld;

 public interface MessageService {
      void sendMessage();
}
class MessageServiceImpl implements MessageService{


    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();

        //anonymous class
        MessageService  messageService1 = new MessageService() {
            @Override
            public void sendMessage() {

            }
        };
        messageService1.sendMessage();

        MessageService lambda = ()->{
            System.out.println("lambda messsage");
        };
        lambda.sendMessage();
    }

    @Override
    public void sendMessage() {

    }
}
