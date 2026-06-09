class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;;

        for(int i=0 ; i < nums.length ; i ++){
            if(max<nums[i]) max = nums[i];
        }
         for(int i=0 ; i < nums.length ; i ++){
            if(min>nums[i]) min = nums[i];
        }
        long ans = (long)k *(max - min);
        return ans ;
    }
}