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
    public int goodNodes(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);
    }

    public int helper(TreeNode root, int currMax){
        if(root==null)return 0;

        int goodNodes=0;

        if(root.val>=currMax){
            goodNodes=1;
            currMax=root.val;
        }

        int lAns=helper(root.left,currMax);
        int rAns=helper(root.right,currMax);

        return lAns+rAns+goodNodes;
    }
}
