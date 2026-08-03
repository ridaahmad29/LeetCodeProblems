
class Solution {
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        flag=true;
        levels(root);
        
        return flag; 
    }
    private static int levels(TreeNode root) {
        if(root == null) return 0;
        int rightLevel =levels(root.right);
        int leftLevel = levels(root.left);
        if(Math.abs(leftLevel-rightLevel)>1) flag= false;

        return 1+ Math.max(leftLevel,rightLevel);
    }
}