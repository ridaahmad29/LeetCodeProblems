class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int ans =-1;
        if(k==1){
            for(Map.Entry<Integer,Integer> e :map.entrySet()){
                if(e.getValue()==1){
                    ans = Math.max(e.getKey(),ans);
                }
            }
            return ans;
        }
        else if(k==nums.length){
            int max = Integer.MIN_VALUE;
            for(int i=0;i< nums.length;i++){
               if(nums[i]>max){
                   max=nums[i];
                }
            }
            return max;
        }
        else{
           if(map.get(nums[0])==1) ans = Math.max(ans,nums[0]);
           if(map.get(nums[nums.length-1])==1) ans = Math.max(ans,nums[nums.length-1]); 

           return ans;
        }
    }
}
