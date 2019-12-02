class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> rowList = new ArrayList<Integer>();
            for (int j = 0; j < i+1; j++) {
                if (j == 0 || j == i) {
                    rowList.add(1);
                }
                else {
                    rowList.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(rowList);
        }
        return result.get(rowIndex);
    }
}