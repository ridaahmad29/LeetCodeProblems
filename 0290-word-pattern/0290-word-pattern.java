class Solution {
    public boolean wordPattern(String pattern, String s) {
       HashMap<Character,String> map1 = new HashMap<>();
       HashMap<String,Character> map2 = new HashMap<>();

       int p_idx=0;
       int i=0;
       int w_cout=0;
       while( i< s.length()){
            if (p_idx >= pattern.length()) return false;
            char a =pattern.charAt(p_idx++);

            String b="";
            int ptr=i;
            while(ptr<s.length() && s.charAt(ptr)!=' '){
                b+= s.charAt(ptr);
                ptr++;
            }
            i=ptr+1;  w_cout++;
            if(map1.containsKey(a) && !map1.get(a).equals(b)) return false;
            if(map2.containsKey(b) && !map2.get(b).equals(a)) return false;
            map1.put(a,b); 
            map2.put(b,a);

       }
       return w_cout==pattern.length();
    }
}