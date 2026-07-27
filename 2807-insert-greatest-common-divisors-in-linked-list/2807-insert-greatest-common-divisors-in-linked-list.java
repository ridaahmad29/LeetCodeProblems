/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;

        ListNode temp = head ;
        ListNode fwd = temp.next;
        while(temp.next!=null && fwd!=null){
            int gcd = gcd(temp.val,fwd.val);
            ListNode newNode = new ListNode(gcd);
            newNode.next=fwd;
            temp.next=newNode;

            temp=temp.next.next; fwd = fwd.next;
        }
        return head;

    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}