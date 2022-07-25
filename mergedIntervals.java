package Arrays;


import java.util.Arrays;
import java.util.LinkedList;

class solution9 {
    public int[][] merge(int[][] intervals) {

        // striver solution is also good

        //watch video for good explanation

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); // remember this , it can be useful in descending sorting

        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {


            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {

                merged.add(interval);

            } else {

                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);

            }

        }

        return merged.toArray(new int[merged.size()][]);

    }
}

public class mergedIntervals {
}
