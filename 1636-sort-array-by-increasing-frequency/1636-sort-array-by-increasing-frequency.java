class Solution {
    public int[] frequencySort(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i:nums){
        map.put(i ,map.getOrDefault(i,0)+1);
       }
       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
       list.sort((a,b) ->{
            if(a.getValue()==b.getValue()) {
                return b.getKey()-a.getKey();
            }
            return a.getValue()-b.getValue();
        });

       int[] res= new int[nums.length];
       int idx=0;
       for(Map.Entry<Integer,Integer> e:list){
        int k = e.getKey(); int v =e.getValue();
        for(int i =0;i<v;i++){
            res[idx++]=k;
        }
       }
       return res;
    }
}