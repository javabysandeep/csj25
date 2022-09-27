package array;

public class Demo7Duplicates {
    public static void main(String[] args) {
        int[] array = {1, 2,1};
        System.out.println(isDuplicatePresent(array) ? "Duplicate" : "Not Duplicate");
    }

    private static boolean isDuplicatePresent(int[] array) {
        if (array == null) {
            return false;
        }
        for (int index = 0; index < array.length; index++) {
            for (int j = 0; j < array.length && index!=j; j++) {
                if (array[index] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
