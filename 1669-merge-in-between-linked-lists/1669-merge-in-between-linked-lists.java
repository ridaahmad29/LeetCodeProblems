class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        for(int i =0; i < a-1;i++){
            temp= temp.next;
        }
        ListNode second = temp.next;
        for(int j = a;j< b;j++){
            second=second.next;
        }
        ListNode third = second.next;

        temp.next= list2;
        temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = third;

        return list1;
    }
}