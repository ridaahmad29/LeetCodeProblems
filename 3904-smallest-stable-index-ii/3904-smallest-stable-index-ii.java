class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] preMax= new int[nums.length];
        preMax[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            preMax[i]=Math.max(preMax[i-1],nums[i]);
        }
        int[] suffMin=new int[nums.length];
        suffMin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suffMin[i]=Math.min(suffMin[i+1],nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(preMax[i]-suffMin[i] <=k) return i;
        }
        return -1;
    }
}