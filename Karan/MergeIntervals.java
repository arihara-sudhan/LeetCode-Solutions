class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> result=new ArrayList<int[]>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        for(int[] interval:intervals)
        {
            if(interval[0]<=end){
                end=Math.max(end,interval[1]);
            }
            else{
                result.add(new int[]{start,end});
                start=interval[0];
                end=interval[1];
            }
        }
        result.add(new int[] {start,end} );
        return result.toArray(new int[0][]);
    }
}
