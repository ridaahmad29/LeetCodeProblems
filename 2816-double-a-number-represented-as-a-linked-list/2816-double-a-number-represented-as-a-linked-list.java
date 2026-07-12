class Solution {
    public ListNode doubleIt(ListNode head) {

        ListNode temp = reverse(head);
        ListNode dummy = new ListNode(-1);
        ListNode curr= dummy;
        int carry =0;
        while(temp!=null){
            int value=temp.val *2 +carry;
            curr.next= new ListNode(value%10);
            curr=curr.next;
            carry = value/10;
            temp=temp.next;
        }
        if(carry!=0) curr.next=new ListNode(carry);
        dummy = dummy.next;
        ListNode newHead=reverse(dummy);

        return newHead;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr =head;

        while(curr!=null){
           ListNode fwd = curr.next;
           curr.next=prev;
           prev = curr;
           curr= fwd;
        }
        return prev;
    }
}