class Solution {
    public int arraySign(int[] nums) {
        long product = 1;
        
        int positive = 0;
        int negative = 0;
        
        for(int n : nums){
            if (n == 0){
                return 0;
            } else if (n < 0){
                negative++;
            }
        }
        
        if (negative%2 == 0){
            return 1;
        } else {
            return -1;
        }

    }
}