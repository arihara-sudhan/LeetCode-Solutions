import java.util.*;
class sample {
    public String array(String[] str){
        int curr=0;
        String res="";
        if(str.length==1)
            return str[0];
        while(true){
            for(int i=0;i<str.length-1;i++)
            {
                if(curr>=str[i].length()||curr>=str[i+1].length()||str[i].charAt(curr)!=str[i+1].charAt(curr))
                {
                    return res;
                }
            }
            res=res+str[0].charAt(curr);
            curr++;
        }
        
    }
}
class Main{
    public static void main(String args[]){
    String[] str={"flower","flow","flight"};
    sample o=new sample();
    System.out.println(o.array(str));
    }
}
