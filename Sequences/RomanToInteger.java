import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (char c : s.toCharArray()) {
            result += map.get(c);
        }
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                result -= 2;
            }
            if (s.charAt(i) == 'X' && (s.charAt(i+1) == 'C' || s.charAt(i+1) == 'L')) {
                result -= 20;
            }
            if (s.charAt(i) == 'C' && (s.charAt(i+1) == 'M'|| s.charAt(i+1) == 'D')) {
                result -= 200;
            }
        }
        return result;
    }
}