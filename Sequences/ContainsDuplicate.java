import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() == nums.length) {
            return false;
        }
        else {
            return true;
        }
    }
}