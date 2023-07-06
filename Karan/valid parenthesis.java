import java.util.Stack;
class Main{ 
    public static void main(String args[])
    {
        String str="{[()]}";
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='{'||ch=='('||ch=='[')
            {
                st.push(ch);
            }
                else{
                    if(st.isEmpty()){
                        System.out.println("INVALID");
                    }
                    else if(ch=='}')
                    {
                        if(st.peek()=='{')
                            st.pop();
                        else{
                            System.out.println("INVALID");
                            break;
                        }
                    }
                    else if(ch==']')
                    {
                        if(st.peek()=='[')
                            st.pop();
                        else{
                            System.out.println("INVALID");
                            break;
                        }
                    }
                    else if(ch==')')
                    {
                        if(st.peek()=='(')
                            st.pop();
                        else{
                            System.out.println("INVALID");
                            break;
                        }
                    }
                }
            }
        
        if(st.size()==0)
            System.out.println("PARENTESIS VALID");
        else
            System.out.println("PARENTHESIS INVALID");
    }
}
