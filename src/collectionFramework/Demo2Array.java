package collectionFramework;

public class Demo2Array {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.add(10);
        System.out.println("size of the array "+ dynamicArray.size);
        System.out.println("Capacity of the array "+ dynamicArray.initialCapacity);
    }
}


