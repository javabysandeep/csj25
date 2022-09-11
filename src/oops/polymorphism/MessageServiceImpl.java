package oops.polymorphism;

public class MessageServiceImpl extends MessageService {
//  private > default > protected > public
    @Override
    public void sendMessage(String message){
        System.out.println("Sending message via whatsApp ");
    }
}
