class Solution {
    public boolean isPalindrome(ListNode head) {
         ArrayList<Integer> l=new ArrayList<Integer>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
            
        }
        int start=0;
        int end=l.size()-1;
        while(start<end)
        {
            if(l.get(start)!=l.get(end))
            
                return false;
                start++;
                end--;
            
        }
        return true;
    }
}
        
    
