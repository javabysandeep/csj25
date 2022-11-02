package collectionFramework.comparableDemo;

public class Demo1 {
    public static void main(String[] args) {
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        Comparable comparable1 = (o)->0;
    }
}
class ComparableImpl implements  Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}