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
    public static void post(TreeNode root,List<Integer> st){
        if(root==null) return;

        post(root.left,st);
        post(root.right,st);
        st.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> st=new ArrayList<>();
        post(root,st);
        return st;
    }
}