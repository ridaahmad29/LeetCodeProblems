class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int max_alt =0;
        for(int i=0 ;i< gain.length ;i ++){
            alt += gain[i];
            max_alt = Math.max(max_alt ,alt);
        }
        return max_alt;
        
    }
}