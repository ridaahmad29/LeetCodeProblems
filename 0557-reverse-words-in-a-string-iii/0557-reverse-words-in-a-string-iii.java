class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int j=0;
        for(int i = 0; i < ch.length ; i ++){
            if(ch[i]==' '){
                reverse(ch,j,i-1);
                j=i+1;
            } 
        }
        reverse(ch,j,ch.length -1);

        return String.valueOf(ch);
    }
    private void reverse(char[] ch,int i , int j){
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]= temp;
            i++;
            j--;
        }
    }
}