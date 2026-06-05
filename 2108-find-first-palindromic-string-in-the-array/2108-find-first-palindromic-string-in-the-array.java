class Solution {
    public String firstPalindrome(String[] words) {
       
       for(String word : words){
          int i = 0 ;
          int j = word.length()-1;
          boolean isPalindrome = true;
          
          while( i<j){
             
             if(word.charAt(i) != word.charAt(j)){
                isPalindrome = false;
                break;
                }
              i++;
              j--;
            }
            if(isPalindrome) return word;
        }

       return "";
    }
}
