import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);
        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedT);
        return Arrays.equals(sortedS, sortedT);
    }
}