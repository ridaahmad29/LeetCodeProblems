
class Solution {
    int len =0;
    public int[] nextLargerNodes(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[len];
        int idx =0;
        while(temp!=null){
            while(st.size()>0 && st.peek()<= temp.val){
                st.pop();
            }
            if(st.isEmpty()) ans[idx]=0;
            else{
                ans[idx]=st.peek();
            } 
            idx++; st.push(temp.val);
            temp=temp.next;
        } 
        idx =0; int j = ans.length-1;
        while(idx<j){
            int t = ans[idx];
            ans[idx]= ans[j];
            ans[j]= t;
            idx++; j--;
        }
        return ans;
    }
    public ListNode reverse(ListNode head ){
        ListNode prev = null;
        ListNode curr = head ;

        while(curr!=null){
            len++;
            ListNode fwd = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}