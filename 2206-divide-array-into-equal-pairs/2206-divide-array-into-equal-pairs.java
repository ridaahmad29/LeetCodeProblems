class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int i :nums){
            map.put(i ,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int value = e.getValue();
            if(value%2!=0){
                return false;
            }
        }
        return true;
    }
}