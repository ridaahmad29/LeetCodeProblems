class Solution {
    public int minElement(int[] nums) {
        for(int i = 0 ; i< nums.length ; i ++){
            int sum =0;
            int j = nums[i];
            while(j>0){
                int dig = j%10;
                sum+= dig;
                j/=10;
            }
            nums[i]=sum;
        }
        int min = Integer.MAX_VALUE;
        for(int i =0; i < nums.length ; i ++){
            if(min> nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}