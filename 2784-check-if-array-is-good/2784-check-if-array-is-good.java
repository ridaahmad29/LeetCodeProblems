class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int count =1;
        for(int i =0 ; i <= nums.length-2 ; i ++){
            if(count != nums[i]) return false ;
            else count++;
        }
        return nums[nums.length-1]==nums.length-1;
    }
}