class Solution {
    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        
        PriorityQueue<Integer> rooms = new PriorityQueue();
        rooms.add(intervals[0][1]);

        for (int i = 1 ; i < intervals.length ; i++) {
            if (intervals[i][0] >= rooms.peek()) {
                rooms.poll();
            }
            rooms.add(intervals[i][1]);
        }

        return rooms.size();
    }
}