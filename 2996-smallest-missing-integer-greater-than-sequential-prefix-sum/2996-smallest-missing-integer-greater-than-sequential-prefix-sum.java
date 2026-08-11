class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int idx =0;
        for(int i = 1 ;i< nums.length ;i++){
            if(nums[i]!=nums[i-1]+1){
                break;
            }
            else{
                sum += nums[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i< nums.length ;i++){
            set.add(nums[i]);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}