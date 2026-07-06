class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev =dummy ;
        ListNode curr= head;
        while(curr!= null){
            if(curr.next==null || curr.val!=curr.next.val){
                prev.next = curr;
                prev=curr;
                curr = curr.next;
            }else{
               ListNode j = curr.next;
               while(j!=null && j.val==curr.val){
                 j =j.next;
               }
               curr=j;
            }
        }
        prev.next =curr;

        return dummy.next;
    }
}