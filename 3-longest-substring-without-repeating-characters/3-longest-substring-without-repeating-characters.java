class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0 || s.length() == 1){
            return s.length();
        }
        
        if(s.length() == 2){
            if(s.charAt(0) != s.charAt(1)){
                return 2;
            } else {
                return 1;
            }
        }

        int count = 0;
        int max_count = 0;
        
        String substring = "";
        
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            
            if(substring.contains(String.valueOf(current))){
                count = substring.length();

                if(count > max_count){
                    max_count = count;
                }
                
                int index = substring.indexOf(String.valueOf(current));
                
                if(index == substring.length() - 1){
                    substring = String.valueOf(current);
                } else {
                    substring = substring.substring(index+1);
                    substring = substring + String.valueOf(current);
                }               
                
            } else {
                substring = substring + String.valueOf(current);
                
            }
            
            if(i == s.length()-1){
                count = substring.length();
                if(count > max_count){
                    max_count = count;
                }
            }
            
            System.out.println(substring);
        }
        
        
        return max_count;
        
    }
}