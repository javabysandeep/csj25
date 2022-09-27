package array;

public class Demo4 {
    public static void main(String[] args) {
       int a = 50;

        int[] array2 = {1,2,3,4,5};
        System.out.println(array2.length);

        int[] array = new int[5];
        System.out.println(array.length);
        array[0]= 1;
        array[1]= 2;
        array[2]= 3;
        array[3]= 4;
        array[4]= 5;
       // array[5]= 6;

        //print the array
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

    }
}
