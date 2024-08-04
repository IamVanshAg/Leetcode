class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if((i+1)%3==0 && (i+1)%5!=0){
                answer.add("Fizz");
            }
            if((i+1)%5==0 && (i+1)%3!=0){
                answer.add("Buzz");
            }
            if((i+1)%3==0 && (i+1)%5==0){
                answer.add("FizzBuzz");
            }
            if((i+1)%5!=0 && (i+1)%3!=0){
                answer.add(Integer.toString(i+1));
            }
        }return answer;
    }
}