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
 import java.util.*;
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode> list = new ArrayList<>();
        preorder(root,list);
        for(int i = 0 ; i< list.size()-1 ;i++){
            TreeNode a = list.get(i);
            TreeNode b = list.get(i+1);
            a.right = b;
            a.left=null;
        }
        TreeNode last = list.get(list.size()-1);
        last.right=null; last.left=null;
    }
    public static void preorder(TreeNode root , List<TreeNode> list){
        if(root==null) return;
        list.add(root);
        preorder(root.left,list);
        preorder(root.right ,list);
    }
}