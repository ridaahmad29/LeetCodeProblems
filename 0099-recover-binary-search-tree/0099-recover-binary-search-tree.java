class Solution {
    public void recoverTree(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        inorder(root,list);
        TreeNode f=null; TreeNode s=null;
        for(int i =1;i<list.size();i++){
            if(list.get(i-1).val > list.get(i).val){
                if(f==null) f= list.get(i-1);
                s=list.get(i);
            }
        }
        int temp = f.val;
        f.val=s.val;
        s.val=temp;
    }
    public void inorder(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
}