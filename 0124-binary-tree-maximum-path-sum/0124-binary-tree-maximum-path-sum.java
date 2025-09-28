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
    int maxkal=Integer.MIN_VALUE;
    public int maxval(TreeNode root){
        if(root==null) return 0;
        int leftmax=Math.max(maxval(root.left),0);
        int rightmax=Math.max(maxval(root.right),0);

        int pricesum=root.val+leftmax+rightmax;
        maxkal=Math.max(pricesum,maxkal);

        return root.val+Math.max(leftmax,rightmax);

    }
    public int maxPathSum(TreeNode root) {
        maxval(root);
        return maxkal;
    }
}