class TwoSum{
	public static void main(String[] args) {
		int a[]={2,3,2,5};
		int target=5;
		int b=0;
		for(int i=0;i<a.length;i++){
			for(int j=1;j<=a.length-1;j++){
				b=a[i]+a[j];

				if(b==target){
					System.out.println("The twosum Number is "+b+"=("+i+","+j+")");
				}
			}
		}
	}
}