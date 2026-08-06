class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        level(root);
        return max;
    }
    public static int level(TreeNode root){
        if(root==null) return 0;

        int ll=level(root.left);
        int rl = level(root.right);
        max = Math.max(max, ll+rl);
        return  1 + Math.max(ll,rl);
    }
}