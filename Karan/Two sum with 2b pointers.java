import java.util.*;
class Main{
    public static void main(String args[])
    {
        int  ar[]={1,9,3,6,10,4,2};
        int sum=7;
        Arrays.sort(ar);
        for(int i=0;i<ar.length-1;i++)
        {
             if(ar[i]+ar[i+1]==sum)
                {
                    System.out.println(i);
                    System.out.print(i+1);
                    break;
                }
        }
    }
}
