class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> s;
        for (int i : nums) {
            s.insert(i);
        }
        if (s.size() < nums.size()) {
            return true;
        } else {
            return false;
        }
    }
};