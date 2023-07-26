import java.util.*;
class Main{
    public static void main(String args[])
    {
        int ar[]={1,8,6,2,5,4,8,3,7};
        int l=0;
        int r=ar.length-1;
        int height=0;
        while(l<r)
        {
            height=Math.max(height,Math.min(ar[l],ar[r])*(r-l));
            if(ar[l]>ar[r])
                r--;
            else
                l++;
        }
        System.out.print(height);
    }
}
