class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < deck.length;i++){
            q.add(i);
        }
        int n = q.size();
        int[] ans  =new int[deck.length];
        for(int i = 0; i < n;i++){
            int idx = q.remove();
            ans[idx]=deck[i];
            if(q.size()!=0) q.add(q.remove());
        }
        return ans;
    }
}