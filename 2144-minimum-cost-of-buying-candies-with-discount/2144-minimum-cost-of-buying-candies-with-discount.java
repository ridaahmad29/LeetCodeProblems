import java.util.Arrays;
class Solution {
    public int minimumCost(int[] cost) {
        int sum =0;
        if(cost.length <=2){   
            for(int i : cost){
                sum += i;
            }
            return sum;
        }
        Arrays.sort(cost);
        for(int i = cost.length -1  ;i >=0 ; i= i-3){
            sum += cost[i];
            if(i - 1 >=0){
                sum += cost[i - 1];
            }
        }
        return sum;
    }

}