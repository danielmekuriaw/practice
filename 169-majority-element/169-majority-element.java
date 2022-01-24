class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int max_key = 0;
        
        if (nums.length == 1){
            return nums[0];
        }
        
        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n, 0);
            } else {
                map.put(n, map.get(n) + 1);
                int new_n = map.get(n);
                
                if(map.get(n) > max){
                    max = new_n; 
                    max_key = n;
                    
                    if(max > (nums.length/2)){
                        return max_key;
                    }
                }
                
            }
        }
        
        return max_key;
    }
}