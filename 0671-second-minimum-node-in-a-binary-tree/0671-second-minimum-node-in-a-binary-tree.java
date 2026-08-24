class Solution {

    public int findSecondMinimumValue(TreeNode root) {
        if (root==null) return -1;

        int min = root.val;

        int left = find(root.left,min);
        int right = find(root.right,min);
        if(left==-1) return right;
        if(right==-1) return left;

        return Math.min(left, right);
    }

    public int find(TreeNode root, int min) {
        if(root==null) return -1;
        if (root.val > min) {
            return root.val;
        }
        int left = find(root.left, min);
        int right = find(root.right, min);

        if (left==-1) return right;
        if (right==-1) return left;

        return Math.min(left,right);
    }
}