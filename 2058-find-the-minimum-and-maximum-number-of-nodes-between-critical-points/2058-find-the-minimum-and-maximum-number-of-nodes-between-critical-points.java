class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next ==null) return new int[]{-1,-1};

        List<Integer> list = new ArrayList<>();
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode forward = curr.next;
        int idx =1;
        while(forward !=null){
            idx ++;
            if(prev.val < curr.val && forward.val < curr.val){
                list.add(idx);
            }
            else if(prev.val > curr.val && forward.val > curr.val){
                list.add(idx);
            }
            prev = prev.next;
            curr = curr.next;
            forward = forward.next;
        }
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i< list.size();i++){
            min = Math.min(min, list.get(i)-list.get(i-1));
        }
        int max = list.get(list.size()-1)-list.get(0);

        return new int[]{min,max};
    }
}