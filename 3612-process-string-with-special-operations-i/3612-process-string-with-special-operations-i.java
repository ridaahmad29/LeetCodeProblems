class Solution {
    public String processStr(String s) {
        StringBuilder str =new StringBuilder();
        for(int k =0; k< s.length(); k++){
            char ch = s.charAt(k);
            if(Character.isLetter(ch)){
                str.append(ch);
            }
            else if(ch == '*'){
                if(str.length()>0){
                    str.deleteCharAt(str.length() - 1);
                }
            }
            else if(ch=='#'){
                str.append(str.toString());
            }
            else if(ch=='%'){
                str.reverse();
            }
        }
        return str.toString();
    }
}