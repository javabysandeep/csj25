package array;

public class Demo12ArrayMaxElement {
    public static void main(String[] args) {
        int[] array = {11, 32, 23, 4, 45, 69, 12};
        System.out.println(maxElement(array));
    }

    private static int maxElement(int[] array) {
        if (array == null) return -1;
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
          if(max < array[index]){
              max = array[index];
          }
        }
        return max;
    }

}
