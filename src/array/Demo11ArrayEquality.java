package array;

import java.util.Arrays;

public class Demo11ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {11, 32, 23, 4, 45, 69, 12};
        int[] array2 = {1, 2, 13, 12, 25, 15,18};

        boolean isEqual = checkArrayEquality(array1, array2);
        System.out.println(isEqual);
    }

    private static boolean checkArrayEquality(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) return false;
        if (array1.length != array2.length) return false;
        if (array1 == array2) return true;
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                    break;
                }
            }
        }
        return count == array1.length;
    }
}
