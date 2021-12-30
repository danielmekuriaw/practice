class Solution {
    public int[] sumZero(int n) {
        
        int[] returned_array = new int[n];
        
        if(n%2 == 0){
            int x = 1;
            int index = 0;
            
            while(x <= n/2){
                returned_array[index] = x;
                index++;
                x++;
            }
            
            int p_index = 0;
            
            while(index < n){
                returned_array[index] = -1*returned_array[p_index];
                p_index++;
                index++;
            }
            
        } else {
            int x = 0;
            int index = 0;
            
            while(x <= n/2){
                returned_array[index] = x;
                index++;
                x++;
            }
            
            int p_index = 1;
            
            while(index < n){
                returned_array[index] = -1*returned_array[p_index];
                p_index++;
                index++;
            }
            
        }
        
        return returned_array;
    }
}