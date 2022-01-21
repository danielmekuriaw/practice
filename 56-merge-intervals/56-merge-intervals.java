class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> returned_list = new ArrayList<int[]>();
        
        Arrays.sort(intervals, Comparator.comparingInt(x->x[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        int index = 0;
        
        if (intervals.length == 1){
            return intervals;
        }
        
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= end && intervals[i][1] > end){
                end = intervals[i][1];
                
            } else if (intervals[i][0] > end){
                int[] arr = {start, end};
                returned_list.add(arr);
                
                start = intervals[i][0];
                end = intervals[i][1];
                
            }
            
            if (i == intervals.length - 1){
                int[] a = {start, end};
                returned_list.add(a);
                break;
            }
        }
        
        int[][] returned = new int[returned_list.size()][2];
        
        for(int i = 0; i < returned_list.size(); i++){
            returned[i] = returned_list.get(i);
        }
        
        return returned;
    }
}