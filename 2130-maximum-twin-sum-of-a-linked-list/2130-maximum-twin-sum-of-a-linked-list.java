class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // divide in half 
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverse(slow);
        fast =head;

        int max = Integer.MIN_VALUE;

        while(head2!=null){
            max = Math.max(max, fast.val + head2.val);
            fast = fast.next;
            head2= head2.next;
        }
        return max;

    }
    static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode forward = null;
        // prev.next = forward.next = head;

        ListNode curr = head;
        while(curr!=null){
            forward = curr.next;
            curr.next= prev;
            prev = curr; 
            curr = forward;
        }
        return prev;
    }
}