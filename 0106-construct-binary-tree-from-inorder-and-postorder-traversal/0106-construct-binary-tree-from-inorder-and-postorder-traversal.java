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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
       return build(0,n-1,0,n-1,postorder,inorder); 
    }
    public static TreeNode build(int pl,int ph,int il,int ih,int[] postorder, int[] inorder){
        if(pl> ph || il>ih) return null;
        int value = postorder[ph];
        TreeNode root = new TreeNode(value);
        int r =0;
        for(int i =il ;i<= ih;i++){
            if(value==inorder[i]){
                r=i;
                break;
            }
        }
        int count=r-il;
        root.left= build(pl,pl+count-1 ,il ,r-1 ,postorder,inorder );
        root.right = build(pl+count,ph-1 ,r+1, ih ,postorder , inorder );
        return root;
    }
}