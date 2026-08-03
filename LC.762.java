class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        HashSet<Integer> primes = new HashSet<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
        primes.add(19);
        for(int num = left ; num <= right ; num++){
            int bits = Integer.bitCount(num);
            if(primes.contains(bits)){
                count++;

            }

            

        }
        return count;
    }
}
