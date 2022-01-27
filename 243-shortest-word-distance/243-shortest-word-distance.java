class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        boolean counter_switch = false;
        int distance = 0;
        int min_distance = Integer.MAX_VALUE;
        boolean second_round = false;
        String not_word = "";
        
        for(int i = 0; i < wordsDict.length; i++){
            if(wordsDict[i].equals(word1) || wordsDict[i].equals(word2)){
                if(counter_switch){
                    if(!second_round){
                        
                        if(!wordsDict[i].equals(not_word)){
                            
                            if(distance < min_distance){
                                min_distance = distance;
                            }
                            
                            distance = 1;
                            not_word = wordsDict[i];
                            second_round = false;
                        }

    
                    } else {
                        
                        if(!wordsDict[i].equals(not_word)){
                            
                            if(distance < min_distance){
                                min_distance = distance;
                            }
                            
                            distance = 1;
                            not_word = wordsDict[i];
                            second_round = false;
                        }
                        
                    }
                    
                } else {
                    distance++;
                    counter_switch = true;
                }
            } else if(counter_switch){
                distance++;   
            }
            
        }
        
        return min_distance;
        
    }
}