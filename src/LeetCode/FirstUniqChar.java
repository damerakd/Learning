package LeetCode;

import java.util.HashMap;

public class FirstUniqChar {

    public int firstUniqChar(String s) {

        HashMap<Character, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            hashmap.put(s.charAt(i), hashmap.getOrDefault(s.charAt(i), 0) + 1);

        }

        for (int i = 0; i < s.length(); i++) {

            if (hashmap.get(s.charAt(i)) == 1) {
                return i;
            }

        }
        return -1;

    }
}
