class Solution {
    public int[] sortArrayByParity(int[] nums) {
        boolean swap = true;
        
        while(swap){
            swap = false;
            
            for(int i = 0; i < nums.length-1; i++){
                if(nums[i]%2!=0 && nums[i+1]%2 == 0){
                    swap = true;
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
        }

        return nums;
    }
}