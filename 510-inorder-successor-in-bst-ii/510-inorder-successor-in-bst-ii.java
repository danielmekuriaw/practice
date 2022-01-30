/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node inorderSuccessor(Node node) {
        if(node.right != null){
            if(node.right.left == null){
                return node.right;
                
            } else {
                Node current = node.right.left;
                Node parent = null;
                
                while(current != null){
                    parent = current;
                    current = current.left;
                }
                
                return parent;
            }
            
        } else {
            if(node.parent != null){
                Node current = node.parent;
                
                while(current != null){
                    if(current.val > node.val){
                        return current;
                    }
                    
                    current = current.parent;
                }
            }
            
            return null;
        }
    }
}