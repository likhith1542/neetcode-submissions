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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> hMap=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            hMap.put(inorder[i],i);
        }        

        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hMap);
    }

    public TreeNode helper(int preorder[],int ps,int pe,int inorder[],int is,int ie,Map<Integer,Integer> hMap){
        if(pe<ps || ie<is)return null;

        TreeNode root=new TreeNode(preorder[ps]);

        int inRoot=hMap.get(root.val);
        int numsLeft=inRoot-is;

        root.left=helper(preorder,ps+1,pe+numsLeft,inorder,is,inRoot-1,hMap);
        root.right=helper(preorder,ps+1+numsLeft,pe,inorder,inRoot+1,ie,hMap);

        return root;
    }
}
