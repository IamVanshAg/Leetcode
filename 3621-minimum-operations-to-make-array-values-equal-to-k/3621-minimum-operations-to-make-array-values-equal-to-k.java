class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int x:nums){
            if(x<k){
                return -1;
            }else if(x>k){
                s.add(x);
            }
        }
        return s.size();
    }
}