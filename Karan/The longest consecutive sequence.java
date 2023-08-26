import java.util.*;
class Main{
    public static void main(String args[])
    {
        int ar[]={0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(ar);
        int req=1;
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]+req==ar[i+1])
            {
                li.add(ar[i]);
            }
        }
        int ans=li.size()+1;
        System.out.print("The longest sonsecutive sequenceis:"+ans);
        }
}
