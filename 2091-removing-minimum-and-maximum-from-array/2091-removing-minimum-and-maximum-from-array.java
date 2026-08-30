class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE; int idx1=0;
        int min = Integer.MAX_VALUE; int idx2=0;
        int n = nums.length;
        if(n==1) return 1;

        for(int i = 0;i<n;i++){
            if(nums[i]>max){
                max =nums[i];
                idx1=i;
            }
            if(min>nums[i]){
                min=nums[i];
                idx2=i;
            }
        }
        int con1=0; int con2=0; int con3=0;

        con1 =Math.max(idx1,idx2)+1;

        con2 =n - Math.min(idx1,idx2);

        con3 =Math.min(idx1,idx2)+1+n-Math.max(idx1,idx2);

        return Math.min(con1 ,Math.min(con2,con3));
    }
}