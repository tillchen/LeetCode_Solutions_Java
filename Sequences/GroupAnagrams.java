import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return Collections.emptyList();
        }
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        int j = 0;
        for (int i = 0; i < strs.length; i++) {
            char[] sortedArray = strs[i].toCharArray();
            Arrays.sort(sortedArray);
            String sortedString = String.valueOf(sortedArray);
            if (!map.containsKey(sortedString)) {
                map.put(sortedString, j++);
                List<String> subList = new ArrayList<String>();
                subList.add(strs[i]);
                result.add(subList);
            }
            else {
                result.get(map.get(sortedString)).add(strs[i]);
            }
        }
        return result;
    }
}