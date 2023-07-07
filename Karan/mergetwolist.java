class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode result=new ListNode(-1);
     ListNode temp=result;
     while(list1!=null && list2!=null)
     {
         if(list1.val<=list2.val)
         {
             temp.next=new ListNode(list1.val);
             list1=list1.next;
         }
         else{
             temp.next=new ListNode(list2.val);
             list2=list2.next;
         }
         temp=temp.next;
     }  
     temp.next=(list1 == null)?list2:list1;
     return result.next;
    }
}
