import java.lang.Math;

class Solution {
    public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        int result;
        try {
            if (x < 0) {
                result = -1 * Integer.parseInt(reversed);
            }
            else {
                result = Integer.parseInt(reversed);
            }
        }
        catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }
}