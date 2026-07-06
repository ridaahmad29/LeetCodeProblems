class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head; 
        ListNode slow =head;
        int len=0;
        if(head==null || head.next==null) return head;

        while(temp!=null){
            len++;
            temp=temp.next;
        }

        k%=len;
        if(k==0) return head;

        temp=head;
        for(int i =0;i< k;i++){
            temp=temp.next;
        }
        while(temp.next!= null){
            slow = slow.next;
            temp =temp.next;
        }
        ListNode newHead =slow.next;
        slow.next=null;
        temp.next= head;
        return newHead;
    }
}