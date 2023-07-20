class TwoSum1{
	public static void main(String[] args) {
		int a[]={2,7,11,8,1};
		int target=12;
		int left=a[0];
		int right=a.length-1;

		for(int i=0;i<=a.length-1;i++){
			if(a[left]+a[right]==target){
				System.out.println(a[left]+","+a[right]+"="+target);
				break;
			}
			else if(a[left]+a[right]<target){
				left++;
			}
			else 
				right--;
		}

	}
}