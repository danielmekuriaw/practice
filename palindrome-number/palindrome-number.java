class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        
        char[] c = s.toCharArray();
        
        int index = 0;
        int length = c.length;
        
        boolean outcome = true;
        
        while(true){
            if (c[index] != c[length-1-index]){
                outcome = false;
                break;
            }
            if (index == length/2){
                break;
            }
            index++;
        }
        
        return outcome;
    }
}