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

 public class TreeNode {
      int val;
      boolean seen;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
          this.seen = false;
      }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List returned_inorder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        if (root == null){
            return returned_inorder;
        }
        
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            
            if(temp.left == null){
                
                returned_inorder.add(temp.val);
                temp.seen = true;
                
                if(temp.right != null){
                     stack.push(temp.right);
                }
                
            } else {
                
                if(temp.seen == false){
                    System.out.println("HERE!");
                    System.out.println(temp.val);
                    temp.seen = true;
                    
                    if(temp.right != null){
                        stack.push(temp.right);
                    }
                    
                    stack.push(temp);
                    stack.push(temp.left);
                    
                } else {
                    returned_inorder.add(temp.val);
                }
                
            }
        }
        
        return returned_inorder;
    }
}