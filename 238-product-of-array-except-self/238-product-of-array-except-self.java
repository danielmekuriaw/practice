class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        boolean zero_check = false;
        int zero_index = 0;
        int zero_count = 0;
        
        for(int i = 0; i < nums.length; i++){
            product = product * nums[i];
            if(nums[i] == 0 && zero_check == false){
                zero_check = true;
                zero_index = i;
            }
            
            if(nums[i] == 0){
                zero_count++;
            }
        }
        
        int prod_except_zero = 1;
        
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                prod_except_zero = prod_except_zero * nums[i];
            }
        }
        
        if (product != 0){
            
            for(int i = 0; i < nums.length; i++){
                answer[i] = product/nums[i];
            }
            
        } else {
            
            for(int i = 0; i < nums.length; i++){
                if (zero_count > 1){
                    answer[i] = 0;
                } else {
                    if (i != zero_index){
                        answer[i] = 0;
                    } else {
                        answer[i] = prod_except_zero;
                    }
                }
            }
            
        }

        
        return answer;
    }
}