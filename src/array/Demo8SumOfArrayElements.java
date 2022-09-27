package array;

public class Demo8SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 10};
        System.out.println(arraySum(array));
    }

    private static int arraySum(int[] array) {
        int sum = 0;
        if (array == null) {
            return sum;
        }
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        return sum;
    }


}
