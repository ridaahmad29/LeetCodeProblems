class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        
        int i = 0 ;
        int j = n-1 ;

        while(i< n && j>=0){
            if(i==0 || j ==n-1){
                leftSum[i]=0;
                rightSum[j]=0;
            }
            int left_sum=0;
            for(int left = i-1 ; left>=0 ; left--){
                left_sum += nums[left];
            }
            leftSum[i]=left_sum;
            i++;

            int right_sum = 0;
            for(int right = j+1 ; right<=n-1 ; right++ ){
                right_sum += nums[right];
            }
            rightSum[j]= right_sum;
            j--;
            
        }
        int[] answer = new int[n];
        for(int k = 0 ; k< n ; k ++){
            answer[k]= leftSum[k] - rightSum[k];
            if(answer[k]<0){
                answer[k] = -(answer[k]);
            }
        }
        
        return answer;   
    }
}