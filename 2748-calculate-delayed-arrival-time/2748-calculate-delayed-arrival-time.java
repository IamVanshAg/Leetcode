class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int DelayedArrival = arrivalTime + delayedTime;
        int n = DelayedArrival % 24;
        return n;
    }
}