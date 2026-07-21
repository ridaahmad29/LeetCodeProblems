class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        ListNode temp=head;
        int len = 1;

        while(temp!=null){
            ListNode end = temp;
            int count =1;
            while(count<len && end.next!=null){
                end = end.next;
                count++;
            }
            ListNode newGr = end.next;
            end.next = null;

            if(count%2==0){
                ListNode newHead = reverse(temp);
                curr.next = newHead;
                temp.next = newGr;
                curr = temp;
            }else{
                curr.next = temp;
                end.next = newGr;
                curr = end;
            }
            temp = newGr;
            len++;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head ;

        while(curr!=null){
            ListNode fwd =curr.next;
            curr.next = prev;
            prev= curr;
            curr= fwd;
        }
        return prev;
    }
}