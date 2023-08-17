class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] a:matrix){
            int start = 0, last = a.length - 1, mid;
            while(start<last){
                mid = (start+last)/2;
                if(a[mid]==target)
                    return true;
                else if(a[mid]<target)
                    last = mid-1;
                else
                    start = mid+1;
            }
        }
        return false;
    }
}
