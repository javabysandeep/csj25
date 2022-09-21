package oops.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
    public static void main(String[] args) {
        // apply is abstract method which accepts parameter and returns the output
        Function function = (input) -> {
            return input + " Hello";
        };
        System.out.println(function.apply(10));

        //input can be anything but output should be boolean
        Predicate predicate = (number) -> {
            int num = (Integer) number;
            return num % 2 == 0;
        };
        System.out.println(predicate.test(99));
    }
}
