class Solution {
    public int countNodes(TreeNode root) {
        if (root==null) return 0;
        int l = lHeight(root);
        int r= rHeight(root);

        if (l==r) return (1<<l) -1;

        return 1 + countNodes(root.left) +countNodes(root.right);
    }
    public static int lHeight(TreeNode root){
        int h =0;
        while(root!=null){
            h++;
            root =root.left;
        }
        return h;
    }
    public static int rHeight(TreeNode root){
        int h = 0;
        while(root!=null){
            h++;
            root =root.right;
        }
        return h;
    }
}