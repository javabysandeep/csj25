package array;

public class Demo9ReverseArray {
    public static void main(String[] args) {
        int[] array = {45, 32, 90, 14, 8, 9};
        reverseArray(array);
    }

    private static void reverseArray(int[] array) {
        if (array == null) {
            return;
        }

        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }


}
