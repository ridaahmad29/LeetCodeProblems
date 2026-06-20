class Solution {
    public boolean isFascinating(int n) {
        int n1 = n*2;
        int n2 = n*3;
        String str = String.valueOf(n);
        str += n1;
        str += n2;
        if (str.length()!=9){
            return false;
        }
        int[] count = new int[10];
        for(int i =0 ; i< str.length();i++){
            int dig = str.charAt(i)-'0';
            if(dig ==0 || count[dig] > 0) return false;

            count[dig]++;
        }
        return true;

    }
}