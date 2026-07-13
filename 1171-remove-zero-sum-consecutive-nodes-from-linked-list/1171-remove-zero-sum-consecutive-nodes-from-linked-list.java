class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode temp = dummy;
        int sum=0;
        HashMap<Integer,ListNode> map = new HashMap<>();

        while(temp!=null){
            sum +=temp.val;
            map.put(sum,temp);
            temp=temp.next;
        }
        sum= 0;
        for(temp= dummy; temp!=null ;temp=temp.next){
            sum +=temp.val;
            temp.next= map.get(sum).next;
        }
        return dummy.next;
    }
}