package problems.p242;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testIsAnagram0() {
        String s = "s";
        String t = "t";
        Assert.assertFalse(solution.isAnagram(s, t));
    }

    @Test
    public void testIsAnagram1() {
        String s = "st";
        String t = "ts";
        Assert.assertTrue(solution.isAnagram(s, t));
    }

    @Test
    public void testIsAnagram2() {
        String s = "sss";
        String t = "ssss";
        Assert.assertFalse(solution.isAnagram(s, t));
    }
}
