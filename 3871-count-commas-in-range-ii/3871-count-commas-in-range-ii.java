class Solution {
    public long countCommas(long n) {
        long comma =0;
        long totalCommas = 0;
        long threshold = 1000L;

        while (threshold <= n) {
            comma+= (n - threshold + 1);
            if (threshold > Long.MAX_VALUE / 1000) {
                break;
            }
            threshold *= 1000L;
        }

        return comma;
    }
}