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
    public static void pre(TreeNode root,List<Integer> st){
        if(root==null) return;
        st.add(root.val);
        pre(root.left,st);
        pre(root.right,st);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> st=new ArrayList<>();
        pre(root,st);
        return st;
    }
}