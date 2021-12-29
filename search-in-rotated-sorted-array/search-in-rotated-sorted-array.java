class Solution {
    public int search(int[] nums, int target) {
        int x = 0;
        int y = nums.length - 1;
        
        while (x != y && x < nums.length && y > 0){
            if (nums[x] == target){
                return x;
            } else if (nums[y] == target){
                return y;
            }
            
            x++;
            y--;
        }
        
        if (nums[x] == target){
            return x;
        }
        
        return -1;
    }
}