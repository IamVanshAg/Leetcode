class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int num:nums){
            if(num!=0){
                nums[i++]=num;
            }
        }
        while(i<n){
            nums[i++]=0;
        }
    }
}