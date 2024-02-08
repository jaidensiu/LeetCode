class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        unordered_map<char, int> map;

        for (char c : s) {
            map[c] += 1;
        }

        for (char c : t) {
            map[c] -= 1;
        }

        for (auto [k, v] : map) {
            if (v != 0) {
                return false;
            }
        }

        return true;
    }
};