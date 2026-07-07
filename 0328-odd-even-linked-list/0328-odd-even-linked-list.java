class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode t1 = dummy1;
        ListNode t2 = dummy2;

        ListNode temp = head;
        int len =0;

        while(temp!=null){
            len++;
            if(len%2!=0){
                t1.next=temp;
                t1= t1.next;
            }else{
                t2.next=temp;
                t2=t2.next;
            }
           temp= temp.next;
        }
        t2.next=null;
        t1.next = dummy2.next;
        return dummy1.next;
    }
}