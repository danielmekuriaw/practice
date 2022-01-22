class Solution {
    public void reverseString(char[] s) {
        int end = (s.length/2) + 1;
        
        if (s.length%2 == 0){
            end = (s.length/2);
        }
        
        int j = s.length-1;
        
        for(int i = 0; i < end; i++){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            j--;
        }
    }
}