import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int[] pCount = new int[26];
        int[] w= new int[26];

        for(int i=0;i<p.length();i++){
            pCount[p.charAt(i)-'a']++;
        }
        int k = p.length(); int j=0;
        while(j<k){
            w[s.charAt(j)-'a']++;
            j++;
        }
        if(Arrays.equals(pCount,w)){
            ans.add(0);
        }

        for(int i=k;i<s.length();i++){
            w[s.charAt(i)-'a']++;
            w[s.charAt(i-k)-'a']--;

            if (Arrays.equals(pCount,w)){
                ans.add(i-k +1);
            }
        }
        return ans;
    }
}