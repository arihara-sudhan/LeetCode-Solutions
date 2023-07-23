class Sample{
    public boolean palindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
              return false;
              i++;
              j--;
        }
        return true;
    }
    public String longpalindrome(String s)
    {
        String res=" ";
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            String temp="";
            for(int j=i;j<s.length();j++)
            {
                temp+=s.charAt(j);
                if(palindrome(temp))
                    if(max<temp.length()){
                        res=temp;
                        max=temp.length();
                    }
                
            }
            
        }
        return res;
    }
}
    class Main{
        public static void main(String args[])
        {
            String s="abcaaca";
            Sample o=new Sample();
           System.out.print(o.longpalindrome(s));
        }
    }
