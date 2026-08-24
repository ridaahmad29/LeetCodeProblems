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
    public TreeNode bstToGst(TreeNode root) {

        List<TreeNode> list = new ArrayList<>();
        inorder(root,list);
        Collections.reverse(list);
        int sum = 0;
        for(int i = 0; i<list.size();i++){
            int value= list.get(i).val;
            sum +=value;
            list.get(i).val =sum;
        }
        return root;
    }
    public static void inorder(TreeNode root, List<TreeNode> list){
        if(root==null) return ;

        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}