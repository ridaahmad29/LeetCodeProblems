class Solution {
    public List<List<Integer>> generate(int r) {
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
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                row.add(dp[i][j]);
            }
            list.add(row);
        }
        return list ;
    }
}
