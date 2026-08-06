class Solution {
    public int smallestNumber(int n, int t) {
        if(n==1) return t;
        while (true) {
            if (product(n) % t == 0)
                return n;
            n++;
        }
    }

    private int product(int x) {
        int prod = 1;
        while (x > 0) {
            prod *= x % 10;
            x /= 10;
        }
        return prod;
    }

}