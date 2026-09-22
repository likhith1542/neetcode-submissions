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
    // public List<Integer> rightSideView(TreeNode root) {
    //     if(root==null)return new ArrayList<>();
        
    //     Queue<TreeNode> q=new ArrayDeque<>();
    //     q.offer(root);

    //     List<Integer> res=new ArrayList<>();

    //     while(!q.isEmpty()){
    //         int sz=q.size();

    //         for(int i=0;i<sz;i++){
    //             TreeNode curr = q.poll();
    //             if(i==0)res.add(curr.val);

    //             if(curr.right!=null)q.offer(curr.right);
    //             if(curr.left!=null)q.offer(curr.left);
    //         }
    //     }

    //     return res;
    // }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, 0, res);
        return res;
    }

    private void dfs(TreeNode node, int depth, List<Integer> res) {
        if (node == null) return;

        // first node reached at this depth is the rightmost, since we go right first
        if (depth == res.size()) res.add(node.val);

        dfs(node.right, depth + 1, res);
        dfs(node.left, depth + 1, res);
    }
}
