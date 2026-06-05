class Solution {
    public boolean isPalindrome(String s) {
       int i = 0 ;
       int j = s.length() - 1;
       int flag = 0;

       String str1 = s.toLowerCase();
       while( i<j){
           char ch1 = str1.charAt(i);
           char ch2 = str1.charAt(j);
           if(ch1==' ' || !Character.isLetterOrDigit(ch1)){
               i++;
               continue;
           }
           if(ch2==' '|| !Character.isLetterOrDigit(ch2)){
               j--;
               continue;
           }
           if(ch1 != ch2){
               return false;
           }
           i++;
           j--;
       }
       return true ;
    }
}