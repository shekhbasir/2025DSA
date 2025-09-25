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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> st=new ArrayList<>();
        if(root==null) return st;
        Queue<TreeNode> qst=new LinkedList<>();
        qst.add(root);

        while(!qst.isEmpty()){
            int size=qst.size();
            List<Integer> lst=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=qst.poll();
                lst.add(curr.val);

                if(curr.left!=null) qst.add(curr.left);
                if(curr.right!=null) qst.add(curr.right);
            }
            st.add(lst);
        }

        return st;
    }
}