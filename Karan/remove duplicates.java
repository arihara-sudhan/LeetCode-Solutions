import java.util.*;
class Main{
    public static void main(String args[])
    {
        int ar[]={1,2,2,3,3,4,4,4,5,5};
        int ans[]=new int[ar.length];
        int p=0;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]!=ar[i+1]){
                ans[p++]=ar[i];
            }
        }
        ans[p++]=ar[ar.length-1];
        for(int j=0;j<p;j++)
        {
            System.out.print(ans[j]+" ");
        }
    }
}
