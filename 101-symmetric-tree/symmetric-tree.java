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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
         return true;
        return ismirror(root.left,root.right);
    }
    boolean ismirror(TreeNode p,TreeNode q)
    {
        if(p==null && q==null)
         return true;
        if(p==null || q==null)
         return false;
        if(p.val!=q.val)
         return false;
        return ismirror(p.left,q.right) && ismirror(p.right,q.left);
    }
}