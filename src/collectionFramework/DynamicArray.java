package collectionFramework;

class DynamicArray {
    int initialCapacity = 1;
    int size = 0;
    private Object[] objects;

    public DynamicArray() {
        objects = new Object[initialCapacity];
    }

    public void add(Object object) {
        ensureCapacity();
        objects[size] = object;
        size++;
    }

    private void ensureCapacity() {
        if(size >= initialCapacity){
            createNewArray();
        }
    }

    private void createNewArray() {
        initialCapacity = 2 * initialCapacity;
        Object[] newArray = new Object[initialCapacity];
        arrayCopy(newArray,objects);
    }

    private void arrayCopy(Object[] newArray, Object[] oldArray) {
        for (int index = 0; index < oldArray.length; index++) {
            newArray[index] = oldArray[index];
        }
        objects = newArray;
    }
}