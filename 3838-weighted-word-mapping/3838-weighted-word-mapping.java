class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str = new StringBuilder();

        for(int i =0; i < words.length ; i ++){
            int sum = 0;
            char[] ch = words[i].toCharArray();
            int idx= 0;
            for(char ch1 : ch){
                idx = ch1-'a';
                sum += weights[idx];
            }
            int value = sum %26;
            char map_value = (char)('z'-value);
            str.append(map_value);
        } 
        return str.toString();   
    }
}