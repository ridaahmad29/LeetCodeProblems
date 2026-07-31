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
class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node=node;
        this.level = level;
    }
 }
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        Queue<Pair> q = new LinkedList<>();
        
        int curr = 0;
        q.add(new Pair(root,0));
        list.add(new ArrayList<>());

        while(q.size()>0){
            Pair top = q.remove();
            if(top.level!=curr){
                curr++;
                list.add(new ArrayList<>());
            }
            list.get(curr).add(top.node.val);

            if(top.node.left!=null)
             q.add(new Pair(top.node.left ,top.level+1));
            if(top.node.right!=null)
             q.add(new Pair(top.node.right ,top.level+1));
        }
        return list;
    }
}