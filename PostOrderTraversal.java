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
         List<Integer> arr = new ArrayList<>();

    public void solve(TreeNode root) {
        if(root == null) return;
    
        solve(root.left);
        solve(root.right);
        arr.add(root.val);
    }
       
    public List<Integer> postorderTraversal(TreeNode root) {
        
        solve(root);
        return arr;
    }
}