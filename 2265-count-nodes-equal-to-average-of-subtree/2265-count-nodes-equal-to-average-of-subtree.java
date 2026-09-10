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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return ans;
    }
    public int[] solve(TreeNode curr){
        if(curr==null){
            return new int[]{0,0};
        }
        if(curr.left==null && curr.right==null){
            ans+=1;
            return new int[]{curr.val,1};
        }
        int[] left=solve(curr.left);
        int[] right=solve(curr.right);
        int sum=left[0]+right[0]+curr.val;
        int count=left[1]+right[1]+1;
        if(curr.val==(sum/count))ans+=1;
        return new int[]{sum,count};
    }
}