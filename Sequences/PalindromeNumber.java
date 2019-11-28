class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String string = String.valueOf(x);
        for (int i = 0, j = string.length()-1; i < j; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}