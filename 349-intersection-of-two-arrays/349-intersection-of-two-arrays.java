class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet();
        List intersection_list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums1.length; i++){
            if(!set.contains(nums1[i])){
                set.add(nums1[i]);
            }
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i]) && !intersection_list.contains(nums2[i])){
                intersection_list.add(nums2[i]);
            }
        }
        
        int[] intersection_returned = new int[intersection_list.size()];
        
        if(intersection_list.size() == 0){
            return intersection_returned;
            
        } else {
            for(int i = 0; i < intersection_list.size(); i++){
                intersection_returned[i] = (int)intersection_list.get(i);
            }
        }
        
        return intersection_returned;        
    }
}