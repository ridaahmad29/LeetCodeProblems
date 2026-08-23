class Solution {
    public int[] findMode(TreeNode root) {
        if(root.left==null && root.right==null){
            return new int[]{root.val};
        }

        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        int i =0; int maxf=0;
        List<Integer> res = new ArrayList<>();
        while(i<list.size()){
            int j=i;
            while(j<list.size() && list.get(i).equals(list.get(j))) j++;

            int f=j-i;
            if(f >maxf){
                maxf=f;
                res.clear();
                res.add(list.get(i));
            }
            else if(f ==maxf){
                res.add(list.get(i));
            }
            i=j;
        }
        int[] ans = new int[res.size()];
        for(int j =0;j< res.size();j++){
            ans[j]=res.get(j);
        }
        return ans;
    }
    public static void inorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}