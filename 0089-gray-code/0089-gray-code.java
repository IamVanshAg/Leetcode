class Solution {
    public List<Integer> grayCode(int n) {
        int m = (int)Math.pow(2, n);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<m; i++){
            list.add(i^(i>>1));
        }return list;
    }
}