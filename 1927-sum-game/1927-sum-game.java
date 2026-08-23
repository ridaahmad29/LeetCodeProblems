class Solution {
    public boolean sumGame(String num) {
        char[] ch=num.toCharArray();
        int f_cout =0 ; int s_cout=0;
        int s1=0; int s2=0;
        for(int i =0;i<ch.length/2;i++){
            if(ch[i]=='?'){
                f_cout++;
            }
            else s1+= ch[i]-'0';
        }
        for(int i =ch.length/2;i<ch.length;i++){
            if(ch[i]=='?'){
                s_cout++;
            }
            else s2+= ch[i]-'0';
        }
        if((f_cout+s_cout)%2 ==1) return true;

        if(2*(s1-s2) ==9*(s_cout -f_cout))return false;

        return true;
    }
}