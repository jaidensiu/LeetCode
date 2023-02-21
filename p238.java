import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0 || nums == null) return new int[0];

        int[] res = new int[nums.length];
        int runningProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = runningProduct;
            runningProduct *= nums[i];
        }

        runningProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= runningProduct;
            runningProduct *= nums[i];
        }

        return res;
    }
}