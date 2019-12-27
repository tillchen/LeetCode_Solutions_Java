import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) { // sliding window
        Set<Character> slidingWindow = new HashSet<Character>();
        int result = 0, i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (!slidingWindow.contains(s.charAt(j))) {
                slidingWindow.add(s.charAt(j));
                j++;
                result = Math.max(result, j - i);
            }
            else {
                slidingWindow.remove(s.charAt(i));
                i++;
            }
        }
        return result;
    }
}