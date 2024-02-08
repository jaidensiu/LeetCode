package problems.p217;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testContainsDuplicate0() {
        int[] nums = new int[] {0, 1, 2};
        Assert.assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testContainsDuplicate1() {
        int[] nums = new int[] {0, 1, 2, 1};
        Assert.assertTrue(solution.containsDuplicate(nums));
    }
}
