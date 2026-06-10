class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;

        if(needle.length()==0) return 0;

        int i=0;

        while(i<haystack.length()){
            int idx =i;
            int j =0;

            while(idx < haystack.length() && j< needle.length() && haystack.charAt(idx) == needle.charAt(j)){
                idx++;
                j++;
            }
            if(j==needle.length()){
                return i;
            }
            i++;
            
        }
        return -1; 

    }
}