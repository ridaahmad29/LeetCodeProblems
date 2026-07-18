class Solution {
    // public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    //     int i; 
    //     int j;
    //     int n = nums1.length ;
    //     int[] arr= new int[n];
    //     for(i = 0 ; i< nums1.length ; i ++){
    //         for(j=0 ; j < nums2.length ; j ++){
    //            if(nums1[i]==nums2[j]){
    //                int nextGreater = -1;
    //                 for (int k = j + 1; k < nums2.length; k++) {
    //                     if (nums2[k] > nums2[j]) {
    //                         nextGreater = nums2[k];
    //                         break;
    //                     }
    //                 }
    //                 arr[i] = nextGreater; 
    //                 break;
    //             }
               
    //         }
    //     }
    //     return arr;
    // }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        int[] nge = new int[n];
        
        st.push(nums2[n-1]);
        nge[n-1]= -1;

        for(int i = n-2;i>=0;i--){
            while(st.size()>0 && nums2[i]>= st.peek()){
                st.pop();
            }
            if(st.size()==0) nge[i]=-1;
            else{
                nge[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i=0 ;i< n;i++){
            map.put(nums2[i],nge[i]);
        }
        int idx =0;
        for(int j : nums1){
            if(map.containsKey(j)){
                ans[idx++]= map.get(j);
            }
        }
        return ans;
    }
}