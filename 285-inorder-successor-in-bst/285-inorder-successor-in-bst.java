/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // Either parent or right childe
        
        if(p.right != null){
            if(p.right.left == null){
                return p.right;
            } else {
                TreeNode curr = p.right.left;
                TreeNode parent = null;
                
                while(curr != null){
                    parent = curr;
                    
                    curr = curr.left;
                }
                
                return parent;
            }
        }
        
        TreeNode curr = root;
        TreeNode parent = null;
        
        TreeNode last_greater = null;
        
        while(curr != null){
            if(curr.val == p.val){
                break;
            }
            
            parent = curr;
            
            if(p.val < curr.val){
                last_greater = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        
        if(parent != null){
            System.out.println(parent.val);
            
            if(parent.val > p.val){
                return parent;
            } else {
                return last_greater;
            }
        }
                
        return null;
        
    }
}