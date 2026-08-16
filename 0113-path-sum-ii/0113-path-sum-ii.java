class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root,ans,list,targetSum);
        return ans;
    }
    public static void dfs(TreeNode root,List<List<Integer>> ans,List<Integer> list, int sum){
        list.add(root.val);

        if(root.left==null && root.right==null && sum==root.val){
            ans.add(new ArrayList<>(list));
        }
        if(root.left!=null){
            dfs(root.left,ans ,list,sum-root.val);
        }
        if(root.right!=null){
            dfs(root.right ,ans ,list,sum-root.val);
        }
        list.remove(list.size()-1);

    }
}