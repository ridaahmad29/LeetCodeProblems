class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;
        for(int i=0 ;i< nums.length ;i++){
            sum+= nums[i];
        }
        int digSum =0;
        for(int num : nums){
            while(num>0){
                int dig = num%10;
                digSum += dig;
                num/=10;
            }
        }
        return Math.abs(sum-digSum);
    }
}