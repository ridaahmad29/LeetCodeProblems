import java.util.*;
class Solution {
    static int[] dp;
    public int rob(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int ans1= maxMoney(0,nums.length-1,nums);
        Arrays.fill(dp,-1);
        int ans2= maxMoney(1,nums.length,nums);
        return Math.max(ans1 , ans2);
    }
    public int maxMoney(int i , int j, int[] nums){
        if(i>= j){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pick = nums[i] + maxMoney(i+2 , j , nums);
        int skip= maxMoney(i+1 , j, nums);

        int ans = Math.max(pick, skip);
        dp[i]= ans;
        
        return ans;
    }
}