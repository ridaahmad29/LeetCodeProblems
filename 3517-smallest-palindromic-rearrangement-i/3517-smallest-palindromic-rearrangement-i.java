class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
           freq[ch -'a']++;
        } 
        StringBuilder st = new StringBuilder();
        for(int i = 0 ;i<26;i++){
            int time = freq[i]/2;
            while(time -->0){
                st.append((char)(i+'a'));
            }
        }
        char mid ='\0';
        if(s.length()%2!=0){
            for(int i = 0 ;i<26;i++){
                if(freq[i]%2==1){
                    mid = (char)(i+'a');
                    break;
                }
            }
        }
        String left = st.toString();
        String right = new StringBuilder(left).reverse().toString();

        if(mid!='\0'){
            return left+ mid+right;
        }
        return  left +right;

    }
    
}