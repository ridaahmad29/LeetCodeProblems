class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
      if(head.next==null) return head;

      ListNode dummy = new ListNode(0);
      dummy.next = head;

      ListNode prev = dummy;

      for(int i=1 ;i<left ;i++){
        prev = prev.next;
      }
      ListNode l = prev.next;
      ListNode r = l;
      for(int i =left;i<right ;i++){
        r=r.next;
      }
      //third part
      ListNode third = r.next;
      r.next=null;

      ListNode newHead =reverse(l);  //reverse

      prev.next=newHead;
      l.next=third;

      return dummy.next;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode forward = null;
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