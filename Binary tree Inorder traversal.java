class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        binarytree(result , root);
        return result;
        
    }
    public void binarytree(List<Integer> result , TreeNode root){
        if(root == null){
            return;
        }
        binarytree(result , root.left);
        result.add(root.val);
        binarytree(result , root.right);
    }
}
