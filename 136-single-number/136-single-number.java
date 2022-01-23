class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length == 1){
            return nums[0];
        }
        
        for(int i = 0; i < nums.length-2; i++){
            if(i == 0){
                
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
                
            } else if (i == nums.length-3){
                
                if(nums[i] == nums[i+1]){
                    return nums[i+2];
                } else if (nums[i+1] == nums[i+2]){
                    return nums[i];
                }
                
            } else {
                
                if(nums[i] != nums[i+1] && nums[i+1] != nums[i+2]){
                    return nums[i+1];
                }
                
            }
        }
        
        return 0;
        
    }
}