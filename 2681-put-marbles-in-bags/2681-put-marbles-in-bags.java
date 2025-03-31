class Solution {
    public long putMarbles(int[] weights, int k) {
        List<Integer> cost = new ArrayList<>();
        int w = weights.length;
        for(int i=0; i<w-1; i++){
            cost.add(weights[i]+weights[i+1]);
        }
        Collections.sort(cost);
        int c = cost.size();
        long min = 0, max = 0;
        for(int i=0; i<k-1; i++){
            min+=cost.get(i);
            max+=cost.get(c-i-1);
        }
        return max-min;
    }
}