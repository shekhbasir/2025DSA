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


    public static int isok(TreeNode root){
        if(root==null) return 0;

        int isleft=isok(root.left);
        if(isleft==-1) return -1;
        int isright=isok(root.right);
        if(isright==-1)return -1;
        if(Math.abs(isleft-isright)>1){
            return -1;
        }
        return 1+Math.max(isleft,isright);
    }
    public boolean isBalanced(TreeNode root) {
        return isok(root)!=-1;
    }
}