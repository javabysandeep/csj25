package array;

public class Demo15CharReverse {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D'};
        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right]= temp;
        }
        for (char ch:chars) {
            System.out.print(ch+" ");
        }
    }
}
