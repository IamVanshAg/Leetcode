class Solution {
    public String[] sortPeople(String[] names, int[] h) {
        int n = h.length;
        Map<Integer, String> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(h[i], names[i]);
        }
        Arrays.sort(h);
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[n-i-1] = mp.get(h[i]);
        }
        return ans;
    }
}