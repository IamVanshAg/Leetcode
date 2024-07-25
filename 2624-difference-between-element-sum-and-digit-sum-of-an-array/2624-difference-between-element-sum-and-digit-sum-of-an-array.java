class Solution {
    public int differenceOfSum(int[] nums) {
        int Esum = 0;
        int Dsum = 0;
        for(int i = 0; i < nums.length; i++){
            Esum+=nums[i];
            int val = nums[i];
            //int x;
            while(val>0){
                //int x = val%10;
                Dsum+=val%10;
                val/=10;
            }
        }return Math.abs(Esum-Dsum);
    }
}