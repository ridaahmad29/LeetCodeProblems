class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j =0;
        int count=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            
            if(!set.contains(ch)){
                set.add(ch);
                count = Math.max(count, j - i + 1);
                j++;

            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}