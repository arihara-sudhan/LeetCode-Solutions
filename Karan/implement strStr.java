import java.util.*;
class sample{
    public int exp(String hay,String need)
    {
        if(hay==null||need==null)
        {
            return 0;
        }
        for(int i=0;i<hay.length();i++)
        {
            int m=i;
            for(int j=0;j<need.length();j++)
            {
                if(need.charAt(j)==hay.charAt(m))
                {
                    m++;
                    return i;
                }
                
                else{
                    break;
                }
            }
        }
        return -1;
    }
    
}
class Main{
    public static void main(String args[])
    {
        String hay="hello";;
        String need="ll";
        sample o=new sample();
        System.out.print(o.exp(hay,need));
    }
}
