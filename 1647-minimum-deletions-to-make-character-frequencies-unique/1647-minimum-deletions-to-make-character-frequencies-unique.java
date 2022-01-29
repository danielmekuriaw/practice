class Solution {
    public int minDeletions(String s) {
        List characters = new ArrayList<Character>();
        List frequencies = new ArrayList<Integer>();
        
        char[] s_char_array = s.toCharArray();
        
        for(int i=0; i < s_char_array.length; i++){
            char target = s_char_array[i];
            
            if(characters.contains(target)){
                int index = characters.indexOf(target);
                int frequency = (int)frequencies.get(index);
                frequency++;
                frequencies.set(index, frequency);
                
            } else {
                characters.add(target);
                frequencies.add(1);
            }
        }
        
        Set<Integer> freq_set = new HashSet<Integer>();
        int deletion_count = 0;
        
        for(int i = 0; i < frequencies.size(); i++){
            int frequency = (int)frequencies.get(i);
            while(freq_set.contains(frequency)){
                if(frequency == 0){
                    break;
                }
                frequency--;
                deletion_count++;
            }
            
            freq_set.add(frequency);
        }
        
        return  deletion_count;
    }
}