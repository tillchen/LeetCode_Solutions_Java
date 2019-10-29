import java.util.*;

class Solution {

    private HashMap<Character, Character> mappings;

    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put(']', '[');
        this.mappings.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (this.mappings.containsKey(c)) { // closed brackets
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (this.mappings.get(c) != topChar) {
                    return false;
                }
            }
            else { // open brackets
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}