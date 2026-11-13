class Solution {
    public List<Integer> getRow(int row) {
        int r= row+1;
        int[][] dp = new int[r][r];

        for (int i = 0; i < r; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (i == j)
                    dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < r; i++){
            list.add(dp[r-1][i]);
        }
        return list ;
    }
}