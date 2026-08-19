class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Arrays.sort(reservedSeats,(a,b)->Integer.compare(a[0],b[0]));
        int ans =0;
        int currRow=0;
        for(int i =0;i< reservedSeats.length;){
            int row=reservedSeats[i][0];
            ans+=(row -currRow-1)*2;
            boolean l=true; boolean mid=true; boolean r=true;

            while(i<reservedSeats.length && reservedSeats[i][0]==row){
                int col=reservedSeats[i][1];
                if(col>=2&&col<=5) l=false;
                if(col>=4 &&col<=7) mid=false;
                if(col>=6&&col<=9) r=false;
               
                i++;
            } 
            if(l&&r) ans +=2;
            else if(l ||r || mid) ans+=1;
            currRow=row;
        }
        ans +=(n-currRow)*2;
        return ans;
    }
}