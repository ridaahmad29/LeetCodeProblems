class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch ,map.getOrDefault(ch,0)+1);
        }
        int ans = 0; boolean odd = false;
        for(Map.Entry<Character,Integer> e :map.entrySet()){
            int val = e.getValue();
            ans+=(val/2)*2;

            if(val%2 ==1) odd = true;
        }
        if(odd) ans++;

        return ans;
    }
}