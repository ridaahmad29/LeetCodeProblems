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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
       return build(0,n-1,0,n-1,preorder,inorder); 
    }
    public static TreeNode build(int pl,int ph,int il,int ih,int[] preorder, int[] inorder){
        if(pl> ph || il>ih) return null;
        int value = preorder[pl];
        TreeNode root = new TreeNode(value);
        int r =0;
        for(int i =il ;i<= ih;i++){
            if(value==inorder[i]){
                r=i;
                break;
            }
        }
        int count=r-il;
        root.left= build(pl+1 ,pl+count ,il ,r-1 ,preorder,inorder );
        root.right = build(pl+count+1 ,ph ,r+1, ih,preorder , inorder );
        return root;
    }
}