class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List even_list = new ArrayList<Integer>();
        List odd_list = new ArrayList<Integer>();
        
        int even_index = 0;
        int odd_index = 0;
        
        int[] returned_array = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            if(i%2 == 0){
                while(nums[even_index]%2 != 0){
                    even_index++;
                }
                
                returned_array[i] = nums[even_index];
                even_index++;
                
            } else {
                while(nums[odd_index]%2 == 0){
                    odd_index++;
                }
                
                returned_array[i] = nums[odd_index];
                odd_index++;
            }
        }
        
        return returned_array;

    }
}