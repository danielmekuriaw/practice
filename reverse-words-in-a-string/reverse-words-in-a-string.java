class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String trimmed_string = s.replaceAll("\\s", "");
        String reverse_result = "";
        List strings_lengths = new ArrayList<Integer>();
        
        List strings = new ArrayList<String>();
        
        for (String w : words){
            if(!w.isBlank()){
                strings_lengths.add(w.length());
            }
        }
        
        int prev_end = 0;
        
        int len_s = strings_lengths.size();
        
        for(int i = 0; i < len_s; i++){
            int len = (int) strings_lengths.get(i);
            strings.add(trimmed_string.substring(prev_end, prev_end + len));
            prev_end = prev_end + len;
        }
        
        int s_length = strings.size();
        
        for (int i = s_length - 1; i >= 0; i--){
            
            reverse_result = reverse_result + strings.get(i);
            if (i != 0){
                reverse_result = reverse_result + " ";
            }
        }
        

        
        return reverse_result;
    }
}