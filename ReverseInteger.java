class ReverseInteger{
	public static void main(String[] args) {
	
		int no=-123;
		int rev=0;
		while(no>0 || no<0){

			if(no==0){
				System.out.print("");
			}

			int digit=no%10;
			rev=(rev*10)+digit;
			no=no/10;
		

		}
		System.out.print(rev);

	}

}

	