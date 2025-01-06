class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        List<Integer> pos = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(boxes.charAt(i)=='1'){
                pos.add(i);
            }
        }
        for(int i=0; i<n; i++){
            int sum=0;
            for(int idx : pos){
                int dist = Math.abs(i-idx);
                sum += dist;
            }
            ans[i]=sum;
        }
        return ans;
    }
}