import java.util.Stack;
import java.util.Scanner;
class ValidParanthesis{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String:");

		String a=sc.nextLine();;

		Stack<Character> obj=new Stack<Character>();

		for(int i=0;i<a.length();i++){
			char ch=a.charAt(i);
			if(ch=='[' || ch=='(' || ch=='{'){
				obj.push(ch);
			}
			else 
			{
				if(obj.isEmpty()){
					System.out.println("Invalid. Its means false Statement");
				}
				else if(ch=='}'){
					if(obj.peek()=='{'){
						obj.pop();
					}
					else 
					{
						System.out.println("Invalid. Its means false Statement");
						break;
					}
					
				}
				else if(ch==']'){
					if(obj.peek()=='['){
						obj.pop();
					}
					else 
					{
						System.out.println("Invalid. Its means false Statement");
						break;
					}
				}
				else if(ch==')'){
					if(obj.peek()=='('){
						obj.pop();
					}
					else
					{ 
						System.out.println("Invalid. Its means false Statement");
						break;
					}
				}
			}
		}
		if(obj.size()==0){
			System.out.println("True");
		}
		else 
			System.out.println("False");

	}
}