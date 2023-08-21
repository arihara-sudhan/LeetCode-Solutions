import java.util.*;
class sample{
    public int sub(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(i<s.length())
        {
            while(hm.get(s.charAt(i))!=null)
            {
                hm.remove(s.charAt(j));
                j++;
            }
            hm.put(s.charAt(i),i);
            count=i-j+1;
            i++;
            max=Math.max(count,max);
        }
        return max;
        
    }
}
class Main{
    public static void main(String args[])
    {
        String s="abcabb";
        sample o=new sample();
        System.out.print(o.sub(s));
        
    }
}
