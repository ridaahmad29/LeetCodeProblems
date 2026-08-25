class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length % k!=0) return false;

        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int el: nums){
            map.put(el ,map.getOrDefault(el,0)+1);
        }
        int grp = nums.length/k;
        for(Map.Entry<Integer,Integer> e :map.entrySet()){
            int val = e.getValue();
            if(val>grp) return false;
        }
        return true ;
    }
}