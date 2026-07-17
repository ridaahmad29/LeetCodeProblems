class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count =0;
        for(int i = left ; i <= right;i++){
            String s = words[i];
            char ch1 = s.charAt(0);
            char ch2 = s.charAt(s.length()-1);
            if(check(ch1) && check(ch2)){
                count++;
            }
            else continue;
        }
        return count;
    }
    public boolean check(char ch){
        if(ch=='a') return true;
        if(ch=='e') return true;
        if(ch=='i') return true;
        if(ch=='o') return true;
        if(ch=='u') return true;
        else return false;
    }
}