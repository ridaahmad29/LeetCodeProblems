class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i: nums){
            if(max<i) max = i;
            if(min>i) min = i;
        }
        return gcd(min,max);
    }
    public int gcd(int a,int b){
        if (b == 0)
        return a;
        return gcd(b, a % b);
    }
}