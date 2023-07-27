import java.util.*;
class sample{
public int search(int ar[],int left,int right,int target)
{
    int mid=(left+right)/2;
    while(left<=right)
    {
        if(target==ar[mid])
        {
            return mid;
        }
        else if(ar[left]<=ar[mid])
        {
            if(ar[left]<=target&&target<=ar[mid])
            {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            
        }
        else{
            if(ar[mid]<=target&&target<=ar[right])
            {
                left=mid+1;
            }
            else{
                right=mid-1;;
            }
        }
        
    }
    return 1;
    }
    
}
    
class Main{
    public static void main(String args[])
    {
        int ar[]={4,5,6,7,0,1,2};
        int left=0;
        int right=ar.length-1;
        int target=1;
        sample o=new sample();
       System.out.print(o.search(ar,left,right,target));
    }
}

