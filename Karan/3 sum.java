import java.util.*;
class sample{
    public List ext(int nums[],int sum){
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==sum)
                    {
                        ArrayList<Integer> ans=new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        if(res.contains(ans)==false) res.add(ans);
                    }
                }
            }
        }
        return res;
        
    }
}
class Main{
    public static void main(String args[])
    {
        int nums[]={-4,-1,-1,0,1,2};
        int sum=0;
        sample o=new sample();
        System.out.print(o.ext(nums,sum));
    }
}
