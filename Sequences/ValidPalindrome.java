class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (('a' <= c && c <= 'z') || ('0' <= c && c <='9')) {
                builder.append(c);
            }
        }
        String original = builder.toString();
        String reversed = builder.reverse().toString();
        if (original == null || original.isEmpty()) {
            return true;
        }
        return original.equals(reversed);
    }
}