class MyHashMap {
    private List keys = new ArrayList<Integer>();
    private List values = new ArrayList<Integer>();
    
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if (keys.contains(key)){
            for(int i = 0; i < keys.size(); i++){
                if ((int)keys.get(i) == key){
                    values.set(i, value);
                }
            }
        } else {
            keys.add(key);
            values.add(value);
        }
    }
    
    public int get(int key) {
        if(keys.contains(key)){
            
            for(int i = 0; i < keys.size(); i++){
                if ((int)keys.get(i) == key){
                    return (int)values.get(i);
                }
            }
            
        } else {
            return -1;
        }
        
        return -1;
    }
    
    public void remove(int key) {
        if(keys.contains(key)){
            for(int i = 0; i < keys.size(); i++){
                if ((int)keys.get(i) == key){
                    values.remove(i);
                    keys.remove(i);
                    break;
                }
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */