class MaxStack {
    
    private List arr = new ArrayList<Integer>();
    private int maxIndex;

    public MaxStack() {
        this.maxIndex = 0;
    }
    
    public void push(int x) {
        arr.add(0, x);
        
        if(arr.size() > 0){
            int max = (int)arr.get(0);
            this.maxIndex = 0;
            
            for (int i = 0; i < arr.size(); i++){
                if ((int)arr.get(i) > max){
                    this.maxIndex = i;
                    max = (int)arr.get(i);
                }
            }
        }

        
    }
    
    public int pop() {
        int x = (int)arr.get(0);
        arr.remove(0);
        
        if(arr.size() > 0){
            int max = (int)arr.get(0);
            this.maxIndex = 0;
            
            for (int i = 0; i < arr.size(); i++){
                if ((int)arr.get(i) > max){
                    this.maxIndex = i;
                    max = (int)arr.get(i);
                }
            }
        }
        
        return x;
    }
    
    public int top() {
        return (int)arr.get(0);
    }
    
    public int peekMax() {
        if (arr.size() <= 1){
            return (int)arr.get(0);
        } else {
            return (int)arr.get(this.maxIndex);
        }
        
    }
    
    public int popMax() {
        int x = (int)arr.get(this.maxIndex);
        arr.remove(this.maxIndex);
        
        if(arr.size() > 0){
            int max = (int)arr.get(0);
            this.maxIndex = 0;
            
            for (int i = 0; i < arr.size(); i++){
                if ((int)arr.get(i) > max){
                    this.maxIndex = i;
                    max = (int)arr.get(i);
                }
            }
        }
        
        return x;
    }
    
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */