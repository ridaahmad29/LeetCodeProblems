import java.util.*;
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i =nums.length-1; i >=0  ; i --){
            int num = nums[i];
            while(num>0){
                int dig = num%10;
                list.add(dig);
                num/=10; 
            }
        }
        Collections.reverse(list);
        return  list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}