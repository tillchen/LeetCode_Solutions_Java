class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num)+1);
            }
            else {
                map.put(num, 1);
            }
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result = key;
                break;
            }
        }
        return result;
    }
}