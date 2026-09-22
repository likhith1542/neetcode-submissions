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
    private int maxSum=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);

        return maxSum;
    }

    private int helper(TreeNode root){
        if(root==null)return 0;

        int lSum=Math.max(0,helper(root.left));
        int rSum=Math.max(0,helper(root.right));

        maxSum=Math.max(maxSum,lSum+root.val+rSum);

        return root.val+Math.max(lSum,rSum);
    }
}
