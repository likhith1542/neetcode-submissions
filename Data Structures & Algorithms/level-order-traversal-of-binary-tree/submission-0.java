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
        if(root==null)return new ArrayList<>();
        
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);

        List<List<Integer>> res=new ArrayList<>();

        while(!q.isEmpty()){
            int sz=q.size();
            List<Integer> temp=new ArrayList<>();

            for(int i=0;i<sz;i++){
                TreeNode curr = q.poll();
                temp.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }

            res.add(temp);
        }

        return res;
    }
}
