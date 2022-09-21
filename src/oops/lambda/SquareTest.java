package oops.lambda;

public class SquareTest {
    public static void main(String[] args) {
        //1. traditional way
        Square square1 = new SquareImpl();
        System.out.println(square1.square(10));

        //2. anonymous way
        Square square = new Square() {
            @Override
            public int square(int number) {
                return number* number;
            }
        };
        System.out.println("Square of "+5+"is "+square.square(5));

        //3. Lambda expression
        Square lambda = (number)-> number* number;
        System.out.println(lambda.square(25));
    }
}
class SquareImpl implements Square{

    @Override
    public int square(int number) {
        return number* number;
    }
}