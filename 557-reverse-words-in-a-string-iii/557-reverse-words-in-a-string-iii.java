class Solution {
    public String reverseWords(String s) {
        String reverse_string = "";
        String[] words = s.split(" ");
        
        for(int k = 0; k < words.length; k++){
            String temp = "";
            
           for (int i = words[k].length() - 1; i >= 0; i--) {
               temp = temp + words[k].charAt(i);
           }
            
            if (k==0){
                reverse_string = temp;
            } else {
                reverse_string = reverse_string + " " + temp;
            }
            
        }
        
        return reverse_string;
    }
}