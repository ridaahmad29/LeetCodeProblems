class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        ListNode slow = head;
        ListNode fast =head;

        while(fast.next !=null && fast.next.next!=null){
           
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverse(slow.next);
        slow.next =null;

        merge(head,head2);
    }
    static ListNode merge(ListNode list1, ListNode list2) {
        while(list1!= null && list2!= null){
            ListNode next1 = list1.next;
            ListNode next2 = list2.next;

            list1.next=list2;
            list2.next = next1;

            list1=next1;
            list2=next2;
        }
        return list1;
    }
    static ListNode reverse(ListNode head){
        ListNode prev =null;
        ListNode forward = null;
        ListNode curr =head;

        while(curr!=null){
            forward = curr.next;
            curr.next= prev;
            prev = curr;
            curr= forward;
        }
        return prev;
    }
}