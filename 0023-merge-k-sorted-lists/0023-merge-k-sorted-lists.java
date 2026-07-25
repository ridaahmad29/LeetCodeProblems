class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists){
            arr.add(n);
        }
        while(arr.size()>1){
            ListNode a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);

            ListNode c = merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
    public ListNode merge(ListNode head1 , ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode i = head1;
        ListNode j =head2;

        while(i!=null && j!=null){
            if(i.val<=j.val){
                curr.next= i;
                i=i.next;
                curr= curr.next;
            }else{
                curr.next= j;
                j=j.next;
                curr=curr.next;
            }
        }
        if(i==null) curr.next=j;
        else curr.next=i;

        return dummy.next;
    }
}