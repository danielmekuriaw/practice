class Solution {
    public int reverse(int x) {
                
        String string_x = String.valueOf(x);
        char[] char_x = string_x.toCharArray();
        boolean negative = false;
        
        if (x < 10 && x > -10){
            return x;
        }
        
        if (char_x[0] == '-'){
            negative = true;
        }
        
        int m = 0;
        
        if(negative){
            m = 1;
        }

        int j = char_x.length - 1;
        
        int end = (char_x.length/2);
        
        if (negative){
            end = (char_x.length/2)+1;
        }
        
        for(int i = m; i < end; i++){
            char temp = char_x[i];
            char_x[i] = char_x[j];
            char_x[j] = temp;
            
            j--;
        }
        
        string_x = String.valueOf(char_x);
        
        while(string_x.charAt(m) == '0'){
            string_x = string_x.replaceFirst("0", "");
        }
        
        int reversed = 0;
        
        try {
            reversed = Integer.parseInt(string_x);
        }catch (NumberFormatException e){
            return 0;
        }
        
        return reversed;
    }
}