class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int el : nums1){
            s1.add(el);
        }
        for(int el : nums2){
            s2.add(el);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num : s1){
            if(!s2.contains(num)){
                list1.add(num);
            }
        }
        for(int num : s2){
            if(!s1.contains(num)){
                list2.add(num);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}