class Solution {
    public int titleToNumber(String s) {
        int j = 0;
        int result = 0;
        for (int i = s.length()-1; i > -1; i--) {
            char c = s.charAt(i);
            result += (c - 'A' + 1) * Math.pow(26, j);
            j++;
        }
        return result;
    }
}