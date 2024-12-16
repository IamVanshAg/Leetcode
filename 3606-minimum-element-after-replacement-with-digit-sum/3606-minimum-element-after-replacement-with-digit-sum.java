class Solution {
    public int minElement(int[] nums) {
        int min = 10000;
        for(int num: nums){
            min = Math.min(min, sumOfDigits(num));
        }
        return min;
    }
    private int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}