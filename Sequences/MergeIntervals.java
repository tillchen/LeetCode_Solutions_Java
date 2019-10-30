import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> resultList = new ArrayList<int[]>();
        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(interval[1], end);
            }
            else {
                resultList.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        resultList.add(new int[]{start, end});
        return resultList.toArray(new int[0][0]);
    }
}