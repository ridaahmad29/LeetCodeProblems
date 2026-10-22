class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx = 0;

        int st = 0;
        int end = 0;
        for (int i = 0; i < gas.length; i++) {
            st += gas[i] - cost[i];
            end += gas[i] - cost[i];

            if (st < 0) {
                idx = i + 1;
                st = 0;
            }
        }
        if (end < 0) {
            return -1;
        }
        return idx;
    }
}