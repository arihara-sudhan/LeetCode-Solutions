class MaxProfit{
	public static void main(String[] args) {
		int a[]={7,1,5,3,6,4};
		int profit=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]<a[i+1]){
				profit=profit+(a[i+1]-a[i]);
			}
		}
		System.out.print(profit);
	}
}