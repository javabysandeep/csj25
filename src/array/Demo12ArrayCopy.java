package array;

public class Demo12ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {11, 32, 23, 4, 45, 69, 12};
//        int[] array2 = array1;//new arrray is not getting created.
        int[] array2 = createArrayCopy(array1);
        for (int temp:array2) {
            System.out.println(temp);
        }
    }

    private static int[] createArrayCopy(int[] array1) {
        if (array1 == null) return new int[0];
        int[] result = new int[array1.length];
        for (int index = 0; index < array1.length; index++) {
            result[index] = array1[index];
        }
        return result;
    }

}
