package problems.p735;

import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        while (idx < asteroids.length) {
            int a = asteroids[idx];
            if (stack.isEmpty()) {
                stack.push(a);
                idx++;
            } else {
                if (stack.peek() > 0 && a < 0) {
                    if (stack.peek() > Math.abs(a)) {
                        idx++;
                    } else if (stack.peek() < Math.abs(a)) {
                        stack.pop();
                    } else {
                        stack.pop();
                        idx++;
                    }
                } else {
                    stack.push(a);
                    idx++;
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}