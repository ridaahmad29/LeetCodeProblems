class Solution {
    public double angleClock(int hour, int minutes) {
        double min_angle = minutes*6;
        double hour_angle = (hour%12)*30 + minutes*0.5;

        double angle = hour_angle - min_angle;
        if(angle<0){
            angle = -(angle);
        }

        angle = Math.min(angle,360-angle);
        return angle;
    }
}