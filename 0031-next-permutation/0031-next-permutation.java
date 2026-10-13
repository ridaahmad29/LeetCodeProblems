class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;
        while(i>=0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        if(i>=0){
            int j =n-1;
            while(j>i){
                if(nums[i]<nums[j]){
                    swap(nums,i,j);
                    break;
                }
                j--;
            }
        }
        reverse(nums,i+1,n-1);
    }
    public void swap(int[] nums , int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums,int i ,int j){
        while(i<j){
            swap(nums,i,j);
            i++; j--;
        }
    }
}