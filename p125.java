import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        String str = "";

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) str += c;
        }

        str = str.toLowerCase(); // must reassign cause Strings are immutable

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}