package array;

public class Demo14ArraySecondMaxElement {
    public static void main(String[] args) {
        int[] array = {61,45,60,43,58};
        System.out.println(secondMaxElement(array));
    }

    private static int secondMaxElement(int[] array) {
        if (array == null) return -1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
          if(max < array[index]){
              secondMax = max;
              max = array[index];
          }
          else if(max > array[index] && array[index] > secondMax ){
              secondMax = array[index];
          }
        }
        return secondMax;
    }

}
