package problems.p217;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length != setNums.size();
    }
}