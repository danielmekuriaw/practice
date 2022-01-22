/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List values = new ArrayList<Integer>();
    
    public List<Integer> preorder(Node root) {
        Stack stack = new Stack<Node>();
        stack.push(root);
        
        if(root == null){
            return values;
        }
        
        while(!stack.empty()){
            Node temp = (Node)stack.pop();
            if (temp.children.size() > 0){
                for(int i = temp.children.size()-1; i >=0; i--){
                    stack.push(temp.children.get(i));
                }
            }
            values.add(temp.val);
        }
        
        return values;
    }
    
}