class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> lastOccur = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            lastOccur.put(s.charAt(i), i);
        }
        int start = 0, end=0;
        for(int i=0; i<s.length(); i++){
            end= Math.max(end, lastOccur.get(s.charAt(i)));
            if(i==end){
                list.add(end-start+1);
                start = i+1;
            }
        }
        return list;
    }
}