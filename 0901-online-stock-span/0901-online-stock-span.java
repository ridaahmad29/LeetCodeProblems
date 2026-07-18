class Pair{
    int val;
    int idx;
    Pair(int val,int idx){
        this.val= val;
        this.idx = idx;
    }
}
class StockSpanner {

    Stack<Pair> st;
    int idx ;
    public StockSpanner() {
        st = new Stack<>();
        idx =0;
    }
    
    public int next(int price) {
        while(st.size()>0 && st.peek().val<=price){
            st.pop();
        }
        int span;
        if(st.size()==0) span = idx +1;
        else{
            span = idx - st.peek().idx;
        }
        st.push(new Pair(price,idx));
        idx++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */