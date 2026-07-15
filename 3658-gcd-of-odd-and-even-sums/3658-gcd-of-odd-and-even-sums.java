class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd_len =0; int even_len = 0;
        int sumOdd= 0; int sumEven =0;

        int i=1;
        while(odd_len <n){
            if(i%2!=0){
                sumOdd += i;
                i++;
                odd_len++;
            }
            else i++; 
        }
        while(even_len <n){
            if(i%2==0){
                sumEven += i;
                i++;
                even_len++;
            }
            else i++;
            
        }
        return gcd(sumOdd,sumEven);
    }
    public int gcd(int a,int b){
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}