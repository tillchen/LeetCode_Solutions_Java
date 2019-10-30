import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> mList = new ArrayList<Integer>(3);
                        mList.add(nums[i]);
                        mList.add(nums[j]);
                        mList.add(nums[k]);
                        result.add(mList); // TODO: Resolve duplicates
                    }
                }
            }
        }
        return result;
    }
}