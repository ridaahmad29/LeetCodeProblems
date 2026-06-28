class Solution {
    public int addDigits(int num) {
        int result =sum(num);
        if(result <=9){
            return result;
        }
        return addDigits(result);
    }
    private int sum(int num){
        int sum=0;
        while(num>0){
            int dig = num%10;
            sum+= dig;
            num/=10;
        }
        return sum;
    }
}