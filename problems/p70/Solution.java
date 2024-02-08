package problems.p70;

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev = 1;
        int curr = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = prev + curr;
            prev = curr;
            curr = tmp;
        }
        return curr;
    }
}