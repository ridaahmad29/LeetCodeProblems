class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        Arrays.fill(freq1,-1);
        Arrays.fill(freq2, Integer.MAX_VALUE);

        for(int i =0 ; i < word.length(); i++){
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                freq1[ch -'a']=i;
            } 
            else if (Character.isUpperCase(ch)) {
                freq2[ch -'A'] = Math.min(freq2[ch -'A'],i);
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != -1 && freq2[i]!= Integer.MAX_VALUE && freq1[i]<freq2[i]) {
                count++;
            }
        }

        return count;
    }
}