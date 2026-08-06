class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        view(root,0,list);
        return list;
    }
    public  static void view(TreeNode root, int lvl ,List<Integer> list){
        if(root==null) return;
        if(lvl>=list.size()) list.add(root.val);
        else list.set(lvl,root.val);
        
        view(root.left ,lvl+1 ,list);
        view(root.right,lvl+1 ,list);
        
    }
}