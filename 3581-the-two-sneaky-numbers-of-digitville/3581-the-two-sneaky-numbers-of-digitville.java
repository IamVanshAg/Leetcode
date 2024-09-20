class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0,j=0;i<n;i++){
            if(!set.isEmpty() && set.contains(nums[i])){
                arr[j] = nums[i];
                j++;
            }
            else{
                set.add(nums[i]);
            }
        }
        return arr;
    }
}