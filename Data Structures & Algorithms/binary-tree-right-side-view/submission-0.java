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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)return new ArrayList<>();
        
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);

        List<Integer> res=new ArrayList<>();

        while(!q.isEmpty()){
            int sz=q.size();

            for(int i=0;i<sz;i++){
                TreeNode curr = q.poll();
                if(i==0)res.add(curr.val);
                
                if(curr.right!=null)q.offer(curr.right);
                if(curr.left!=null)q.offer(curr.left);
            }
        }

        return res;
    }
}
