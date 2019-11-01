class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dynamicProgramming = new int[n+1];
        dynamicProgramming[1] = 1;
        dynamicProgramming[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dynamicProgramming[i] = dynamicProgramming[i-1] + dynamicProgramming[i-2];
        }
        return dynamicProgramming[n];
    }
}