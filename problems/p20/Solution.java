package problems.p20;

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && closeToOpen.containsKey(s.charAt(i))) {
                return false;
            } else if (!stack.isEmpty() && stack.peek() == closeToOpen.get(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}