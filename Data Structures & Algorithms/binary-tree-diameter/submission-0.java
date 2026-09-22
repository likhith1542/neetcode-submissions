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
    private int best=0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return best;
    }

    public int maxDepth(TreeNode root) {
        if(root==null)return 0;

        int lDepth=maxDepth(root.left);
        int rDepth=maxDepth(root.right);

        best=Math.max(best,lDepth+rDepth);

        return 1+Math.max(lDepth,rDepth);
    }

    
}
