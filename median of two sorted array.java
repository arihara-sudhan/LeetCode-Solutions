import java.util.*;
class Main{
    public static void main(String args[])
    {
        int ar1[]={-5,3,6,12,15};
        int ar2[]={-12,-10,-6,-3,4,10};
        int i=ar1.length;
        int j=ar2.length;
        int ar3[]=new int[i+j];
        System.arraycopy(ar1,0,ar3,0,i);
        System.arraycopy(ar2,0,ar3,i,j);
        Arrays.sort(ar3);
        for(int k=0;k<ar3.length;k++)
        {
            System.out.print(ar3[k]);
        }
        System.out.println();
        int n=ar3.length;
        if(n%2==0)
        {
            int z=n/2;
            int e=ar3[z];
            int f=ar3[z-1];
            int res=(e+f)/2;
            System.out.print("The median is "+res);
        }
        
        else{
            int src=Math.round(n/2);
            System.out.print("The median is "+ar3[src]);
        }
    }
}
