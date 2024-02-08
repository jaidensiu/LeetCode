package problems.p242;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c0 = s.charAt(i);
            Character c1 = t.charAt(i);
            if (c0 != c1) {
                map.put(c0, map.getOrDefault(c0, 0) + 1);
                map.put(c1, map.getOrDefault(c1, 0) - 1);
            }
        }
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}