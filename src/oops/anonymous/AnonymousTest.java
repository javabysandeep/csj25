package oops.anonymous;

public class AnonymousTest {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.m1();

        MessageService messageService1 = new MessageService() {
            @Override
            public void m1() {
                System.out.println("m1 override in anonymous class");
            }
           };
        messageService1.m1();

    }
}
