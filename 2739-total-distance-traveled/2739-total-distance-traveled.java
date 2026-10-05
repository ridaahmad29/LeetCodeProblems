class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank < 5){
            return mainTank*10;
        }
        int max=0;
        while(mainTank>=5 && additionalTank>0){
            mainTank -=5; additionalTank--;

            mainTank+=1;
            max +=50;
        }
        max += mainTank*10;
        return max;
    }
}