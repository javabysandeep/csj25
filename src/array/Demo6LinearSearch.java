package array;

public class Demo6LinearSearch {
    public static void main(String[] args) {
        int[] array = null;
        int key = 0;
        System.out.println(linearSearch(array, key) ? "Present" : "Not present");
    }

    private static boolean linearSearch(int[] array, int key) {
        if (array==null){
            return false;
        }
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return true;
            }
        }
        return false;
    }
}
