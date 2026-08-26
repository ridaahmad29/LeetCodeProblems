class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        char[] ch = s.toCharArray();
        int l=0; int r =0;
        int count =0;
        while(r<ch.length && count<k){
            if(ch[r]=='1'){
                count++;
            }
            r++;
        }
        if(count<k) return "";

        while(l<r && ch[l]=='0'){
            l++;
        }
        int bestL=l; int bestR=r;
        while(r<ch.length){
            if(ch[r]=='1'){
                count++;
            }
            while(count>k){
                if(ch[l]=='1'){
                    count--;
                }
                l++;
            }
            while(l<r && ch[l]=='0'){
                l++;
            }
            if (r - l + 1 < bestR - bestL) {
                bestL = l;
                bestR = r + 1;
            } 
            else if(r-l+1==bestR-bestL){
                String curr = s.substring(l,r+1);
                String best = s.substring(bestL,bestR);

                if(curr.compareTo(best)<0){
                    bestL=l;
                    bestR= r+1;
                }
            }

            r++;
        }
        return s.substring(bestL, bestR);
    }
}