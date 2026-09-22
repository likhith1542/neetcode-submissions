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
    private boolean isTreeBalanced=true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return isTreeBalanced;
    }

    public int height(TreeNode root) {
        if(root==null)return 0;

        int lDepth=height(root.left);
        int rDepth=height(root.right);

        if(Math.abs(lDepth-rDepth)>1)isTreeBalanced=false;

        return 1+Math.max(lDepth,rDepth);
    }
}
