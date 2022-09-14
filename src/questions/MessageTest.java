package questions;

public class MessageTest {
    public static void main(String[] args) {
       MessageService messageService = new PushNotificationService();
       messageService.send();

    }

}
