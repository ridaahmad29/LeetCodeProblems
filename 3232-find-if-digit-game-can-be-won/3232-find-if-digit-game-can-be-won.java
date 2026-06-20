class Solution {
    public boolean canAliceWin(int[] nums) {
        int s_dig_sum=0;
        int d_dig_sum =0;
        for(int i=0 ;i< nums.length ; i ++){
            if(nums[i]<10){
                s_dig_sum += nums[i];
            }
            else d_dig_sum += nums[i];        
        }
        return s_dig_sum != d_dig_sum ;
    }
}