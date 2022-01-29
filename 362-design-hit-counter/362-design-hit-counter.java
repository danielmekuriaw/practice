class HitCounter {
    List hits = new ArrayList<Integer>();

    public HitCounter() {
    }
    
    public void hit(int timestamp) {
        hits.add(timestamp);
    }
    
    public int getHits(int timestamp) {
        int count = 0;
        for(int i = 0; i < hits.size(); i++){
            int hit = (int) hits.get(i);
            if(hit > timestamp - 300 && hit <= timestamp){
                count++;
            }
        }
        
        return count;
    }
}