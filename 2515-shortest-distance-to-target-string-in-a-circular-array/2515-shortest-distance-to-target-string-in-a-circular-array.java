class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        for (int d=0;d<n;d++){
            int right =(startIndex+d)%n;
            int left =(startIndex-d+n)%n;

            if(words[right].equals(target) || words[left].equals(target)){
                return d;
            }
        }
        return -1;
    }
}