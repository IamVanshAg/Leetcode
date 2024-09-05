class Solution {
    public int findNumbers(int[] nums) {
        int[] count = new int[nums.length];
        int ans=0;
        for(int i=0; i<nums.length; i++){
            while(nums[i]>0){
                int t = nums[i]%10;
                nums[i] /= 10;
                count[i]++;
            }
        }
        for(int i = 0; i<count.length; i++){
            if(count[i]%2==0){
                ans++;
            }
        }return ans;
    }
}