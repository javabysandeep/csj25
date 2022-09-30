package stringHandling;

public class Demo1 {
    public static void main(String[] args) {
        char[] chars = {'1', '2', '3'};//hello world
        CharArray charArray = new CharArray();
        charArray.replace(chars, 'A', 'X');
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println(charArray.length(chars));
        System.out.println(charArray.isEmpty(chars));
        System.out.println(charArray.contains(chars, 'X'));
        System.out.println('0' + 1);//48
        System.out.println('9' + 1);//57
        System.out.println(charArray.containsOnlyDigit(chars));

    }
}

class CharArray {
    void replace(char[] charArray, char oldChar, char newChar) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == oldChar) {
                charArray[i] = newChar;
            }
        }
    }

    char charAt(char[] charArray, int index) {
        if (charArray == null) return ' ';
        if (index < 0 || index >= charArray.length) return ' ';
        return charArray[index];
    }

    int length(char[] charArray) {
        if (charArray == null) return 0;
        return charArray.length;
    }

    boolean isEmpty(char[] charArray) {
        if (charArray == null) return true;
        return charArray.length == 0;
    }

    boolean contains(char[] charArray, char ch) {
        if (charArray == null) return false;
        for (char temp : charArray) {
            if (temp == ch) return true;
        }
        return false;
    }

    boolean containsOnlyDigit(char[] charArray) {
        if (charArray == null) return false;
        for (char ch : charArray) {
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    boolean containsOnlyChars(char[] charArray) {
        return false;
    }

    void trim(char[] charArray) {

    }


}
