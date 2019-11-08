class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            else {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}