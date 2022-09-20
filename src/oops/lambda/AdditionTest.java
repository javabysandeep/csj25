package oops.lambda;

public class AdditionTest {
    public static void main(String[] args) {
        //1. create a subclass and override abstract method
        Addition addition1 = new AdditionImpl();
        System.out.println("Subclass way " + addition1.add(10, 20));

        //2. create anonymous class and override method
        Addition addition2 = new Addition() {
            @Override
            public int add(int number1, int number2) {
                return number1 + number2;
            }
        };
        System.out.println("Anonymous way " + addition2.add(10, 20));

        //3. using lambda expression
        Addition lambda = (number1, number2) -> number1 + number2;
        System.out.println("Lambda way "+lambda.add(10,20));

        //4. Using Method reference
        Addition methodReference = Integer::sum;
        System.out.println("Method reference way "+methodReference.add(10,20));
    }
}
