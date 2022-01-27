class Solution {
    public boolean canPermutePalindrome(String s) {
        List keys = new ArrayList<Character>();
        List values = new ArrayList<Integer>();
        
        for(int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            
            if(!keys.contains(character)){
                keys.add(character);
                values.add(1);
                
            } else {
                int index = keys.indexOf(character);
                int value = (int)values.get(index);
                
                values.set(index, value+1);
            }
        }
        
        boolean all_same = true;
        int odd_count = 0;
        
        char prev = (char)keys.get(0);
        
        for(int i = 0; i < keys.size(); i++){
            char character = (char)keys.get(i);
            
            int value = (int)values.get(i);
            
            if(character != prev){
                all_same = false;
            }
            
            if(value%2 != 0){
                odd_count++;
            }
            
            prev = character;
        }    
        
        if(all_same != true){
            if(odd_count > 1){
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
        
        
        
    }
}