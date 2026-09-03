class Solution {
    public boolean uniformArray(int[] nums1) {
        int Ec=0;int Oc=0;int n=nums1.length;
        int min = Integer.MAX_VALUE;
        for(int i=0 ;i<n;i++){
            min = Math.min(min,nums1[i]);
            if(nums1[i]%2==0) Ec++;
            else Oc++;
        }
        if(Ec== n|| Oc==n) return true;

        return min%2!=0;
    }
}