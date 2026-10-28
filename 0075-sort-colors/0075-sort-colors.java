class Solution {
    public void sortColors(int[] nums) {
        for(int i = 1;i< nums.length ;i++){
            int c = nums[i];
            int p = i-1;
            while(p>=0 && nums[p]>= c){
                nums[p+1] = nums[p];
                p = p-1;
            }
            nums[p+1]=c;
        }
    }
}