class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        for(int i = 0;i < nums.length ; i++){
            if(max <nums[i]){
                max = nums[i];
            }
        }
        int ans = 0;
        while(k>0){
            ans = ans + max;
            max++; k--;
        }
        return ans;
    }
}