class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        
        int shortest_string = 300;
        
        for (String str : strs){
            if (str.length() < shortest_string){
                shortest_string = str.length();
            }
        }
        
        String result = "";
        
        for (int i = 0; i < shortest_string; i++){
            char curr = strs[0].charAt(i);
            boolean flag = true;
            
            for (String str: strs){
                if (str.charAt(i) != curr){
                    flag = false;
                    break;
                }
            }
            
            if (flag == true){
                result = result + strs[0].substring(i, i+1);
            } else {
                break;
            }
            
            
        }
        
        return result;        
        
    }
}