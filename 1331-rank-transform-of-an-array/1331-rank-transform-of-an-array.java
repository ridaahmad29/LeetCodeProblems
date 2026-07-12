class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        int[] ans = new int[arr.length];
        Map<Integer , Integer> map = new HashMap<>();
        int rank=1;
        for(int val : set){
            map.put(val,rank++);
        }
        int idx=0;
        for(int val: arr){
            ans[idx++]=map.get(val);
        }
        return ans;
    }
}