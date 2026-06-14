class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();
        binarytree(result , root);
        return result;

    }
    public void binarytree(List<Integer> result , TreeNode root){
        if(root == null){
            return;
        }
        binarytree(result , root.left);
        binarytree(result , root.right);
        result.add(root.val);
        
    }
}
