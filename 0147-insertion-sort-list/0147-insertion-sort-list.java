class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head.next==null) return head;
        ListNode temp =head;

        List<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        insertionSort(list);
        ListNode Newhead = new ListNode(list.get(0));
        temp = Newhead;

        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i)); 
            temp = temp.next;            
        }

        return Newhead;
        
    }
    public static List<Integer> insertionSort(List<Integer> list){
        for(int i =1; i< list.size();i++){
            int c = list.get(i);
            int p = i-1;
            while(p>=0 && list.get(p) >c){
                list.set(p+1,list.get(p));
                p=p-1;
            }
            list.set(p+1,c);
        }
        return list;
    }
}