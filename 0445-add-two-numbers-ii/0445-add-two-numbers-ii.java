class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode a= dummy;
        ListNode t1= l1;
        ListNode t2=l2;
        int carry =0;

        while(t1!=null && t2!=null){
            int sum= carry + t1.val+t2.val;
            if(sum>=10){
                carry=1;
                sum%=10;
            }
            else carry=0;
            ListNode value = new ListNode(sum);
            a.next=value;
            t1=t1.next;
            t2=t2.next;
            a=a.next;
        }
        if(t1==null){
            while(t2!=null){
                int sum= carry+t2.val;
                if(sum>=10){
                   carry=1;
                   sum%=10;
                }
                else carry=0;

                ListNode value = new ListNode(sum);
                a.next=value;
                t2=t2.next;
                a=a.next;
            }
        }
        else{
            while(t1!=null){
                int sum= carry+t1.val;
                if(sum>=10){
                   carry=1;
                   sum%=10;
                }
                else carry=0;

                ListNode value = new ListNode(sum);
                a.next=value;
                t1=t1.next;
                a=a.next;
            }
        }
        if(carry==1){
            a.next=new ListNode(1);
        }
        dummy = dummy.next;
        dummy = reverse(dummy);
        return dummy;
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