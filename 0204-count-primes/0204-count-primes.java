class Solution {
    public int countPrimes(int n) {
        
    if(n <= 2) return 0;

        int count =0;

        boolean[] isPrime = new boolean[n];

        for(int i =2; i< n; i++)
        {
            isPrime[i]= true;
        }
        for(int i =2; i<n; i++){
            if(isPrime[i])
            {
               count++;
               
               for(int j = i * 2; j<n; j+=i)
               {
                isPrime[j] = false;
               }

            }
        }

        return count;
    }
}