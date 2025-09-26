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
    public static int depth(TreeNode root){
        if(root==null) return 0;

        int leftmax=depth(root.left);
        int rightmax=depth(root.right);
        return 1+Math.max(leftmax,rightmax);
    }
    public int maxDepth(TreeNode root) {

        return depth(root);
    }
}