import java.util.*;
class duplicateArray{
	public static void main(String[] args) {
		int a[]={0,0,1,1,1,2,2,3,3,4};
		int temp[]= new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]!=a[i+1]){
				temp[j++]=a[i];
				temp[j]=a[i+1];
			}

		}
		for(int i=0;i<temp.length-1;i++){
			System.out.println(temp[i]);
		}
		
	}

}