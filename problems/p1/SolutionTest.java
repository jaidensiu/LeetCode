package problems.p1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testTwoSum0() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSum1() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSum2() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

    @Test
    public void testTwoSum3() {
        int[] nums = {3, 3};
        int target = 7;
        int[] expected = {};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}