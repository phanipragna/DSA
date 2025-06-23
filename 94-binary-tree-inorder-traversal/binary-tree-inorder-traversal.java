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
    public List<Integer> res=new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root){
            inorder(root);
            return res;
        }
        public void inorder(TreeNode root){
            if(root!=null){
                inorder(root.left);
                res.add(root.val);
                inorder(root.right);
            }
        }
    }
