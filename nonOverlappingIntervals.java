package Arrays;


import java.util.Arrays;

class Solution21 {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int prevEnd = intervals[0][1];

        int count = 0;


        for(int index=1;index<intervals.length;index++){



            if (prevEnd > intervals[index][0]){

                // overlapped intervals

                prevEnd = Math.min(intervals[index][1],prevEnd);

                count++;


            }else{

                prevEnd = intervals[index][1];


            }


        }

        // this also good approach
        // reverse of above

        //        for (int i = 1; i < intervals.length; i++) {
        //     if (intervals[i].start >= end) {
        //         end = intervals[i].end;
        //         count++;
        //     }
        // }
        // return intervals.length - count;


        return count;



    }
}

public class nonOverlappingIntervals {
}
