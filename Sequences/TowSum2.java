class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return new int[]{-1, -1};
        }
        int i = 0, j = numbers.length-1;
        while (i < j) {
            int currentSum = numbers[i] + numbers[j];
            if (currentSum == target) {
                return new int[]{i+1, j+1};
            }
            else if (currentSum < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}