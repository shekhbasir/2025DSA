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
    private int temp=0;
    public int hamval(TreeNode root){
        if(root==null) return 0;
        int leftval=hamval(root.left);
        int rightval=hamval(root.right);

        temp=Math.max(temp,leftval+rightval);

        return Math.max(leftval,rightval)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        // int temp=0;
        hamval(root);
        return temp;
    }
}