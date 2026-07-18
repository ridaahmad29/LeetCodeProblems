class Pair{
    int val;
    int idx;
    Pair(int val,int idx){
        this.val = val;
        this.idx= idx;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Pair> st =new Stack<>();

        for(int i = n-1;i>=0;i--){

         while(st.size()>0 && temperatures[i]>=st.peek().val){
            st.pop();
         }
         if(st.isEmpty()) ans[i]=0;

         else ans[i]=st.peek().idx-i;
         
         st.push(new Pair(temperatures[i],i));
       }
        return ans;
    }
}