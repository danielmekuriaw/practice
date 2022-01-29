class Solution {
    public double angleClock(int hour, int minutes) {
        
        double angle_min = 0;
        double angle_hour = 0;
        
        angle_min = ((double)minutes / 5) *30;

        double h = (hour % 12) * 30;
        double min = ((double)minutes / 60) * 30;
        angle_hour = h + min;

        double result = Math.abs(angle_min - angle_hour);

        return (result > 180.0) ? (360.0 - result) : result;
    }
}