class Solution {
    public int sumOfSquares(int[] nums) {
        int n= nums.length ;
        long result = 0;
        long value = 0;
        for(int i = 1 ; i <= n ; i ++){
            if(n % i == 0 ){
                value = nums[i-1];
                result += square(value);
            }
        }
        return (int) result ;
    }

    static long  square(long num){
        return num*num;
    }
}