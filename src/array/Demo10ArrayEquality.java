package array;

import java.util.Arrays;

public class Demo10ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {11, 32, 23, 4, 45, 69,12};
        int[] array2 = {10, 2, 21, 3, 458, 69,12};

        boolean isEqual = checkArrayEquality(array1, array2);
        System.out.println(isEqual);
    }

    private static boolean checkArrayEquality(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) return false;
        if (array1.length != array2.length) return false;
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.equals(array1,array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}
