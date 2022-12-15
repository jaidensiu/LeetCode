class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<>();
        for (int i : nums) {
            setNums.add(i);
        }
        if (nums.length != setNums.size()) {
            return true;
        } else {
            return false;
        }
    }
}