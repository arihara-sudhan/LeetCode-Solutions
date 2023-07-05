class Palindrome{
	public static boolean pali(int no) {
		int temp=no;
		int rev=0;

		while(no>0){
			int digit=no%10;
			rev=(rev*10)+digit;
			no=no/10;
		}

		if(rev==temp){
			return true;
		} 
			return false;
	}
	public static void main(String[] args) {
		System.out.print(pali(121));
	}
}