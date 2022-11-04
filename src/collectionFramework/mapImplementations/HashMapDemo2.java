package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
    public static void main(String[] args) {
        // find the occurrence of each character in the given String
        String str = "Collection framework";
        str = str.trim();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }
        System.out.println(hashMap);

    }
}
