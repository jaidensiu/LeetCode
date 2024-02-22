package problems.p3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        List<Character> substring = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (substring.contains(s.charAt(i))) {
                int idx = substring.indexOf(s.charAt(i));
                substring.remove(idx);
                substring.subList(0, idx).clear();
            }
            substring.add(s.charAt(i));
            maxLength = Math.max(maxLength, substring.size());
        }
        return maxLength;
    }
}