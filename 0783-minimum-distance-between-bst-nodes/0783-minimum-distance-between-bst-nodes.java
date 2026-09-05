/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        inorder(root,list);
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
           int diff=list.get(i)-list.get(i-1);
            ans = Math.min(ans,diff);
        }
        return ans;
    }
    public static void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}