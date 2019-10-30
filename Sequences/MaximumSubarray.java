class Solution {
    public int maxSubArray(int[] nums) {
        int dynamicProgramming = nums[0];
        int result = dynamicProgramming;
        for (int i=1; i < nums.length; i++) {
            if (dynamicProgramming > 0) {
                dynamicProgramming += nums[i];
            }
            else { // < 0, counting from the current element
                dynamicProgramming = nums[i];
            }
            if (dynamicProgramming > result) {
                result = dynamicProgramming;
            }

        }
        return result;
    }
}