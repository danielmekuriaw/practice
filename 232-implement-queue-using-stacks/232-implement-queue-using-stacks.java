class MyQueue {
    
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        System.out.println("ADDED: " + x);
        stack1.push(x);
    }
    
    public int pop() {
        
        if(stack2.empty()){
            while (stack1.empty() != true) {
                int temp = stack1.pop();
                System.out.println("PUSHED: " + temp);
                stack2.push(temp);
            }
        }

        return stack2.pop();
    }
    
    public int peek() {
        if(stack2.empty()){
            while (stack1.empty() != true) {
                int temp = stack1.pop();
                System.out.println("PUSHED: " + temp);
                stack2.push(temp);
            }
        }
        
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */