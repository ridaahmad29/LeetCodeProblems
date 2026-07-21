class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode temp = head;
        while(temp!=null){
            ListNode end = temp;
            for(int i = 1 ; i < k && end!=null ;i++){
               end = end.next;
            }
            if(end == null) break;
            ListNode newGr = end.next;
            end.next = null;

            ListNode newHead = reverse(temp);

            curr.next = newHead;
            temp.next = newGr;

            curr = temp;
            temp = newGr;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head ;

        while(curr!=null){
            ListNode fwd = curr.next;
            curr.next = prev ;
            prev = curr;
            curr= fwd;
        }
        return prev;
    }
}  