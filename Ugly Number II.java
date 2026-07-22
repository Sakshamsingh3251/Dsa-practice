class Solution{
    public int nthUglyNumber(int n){
        int[] uglyNumbers = new int[n];

        uglyNumbers[0] = 1;

        int multiplyby2 = 0;
        int multiplyby3 = 0;
        int multiplyby5 = 0;

        for(int position = 1; position < n ; position++){
            int candidatefrom2 = uglyNumbers[multiplyby2] * 2;
            int candidatefrom3 = uglyNumbers[multiplyby3] * 3;
            int candidatefrom5 = uglyNumbers[multiplyby5] * 5;

            int nextUglyNumber = Math.min…efrom2 ,Math.min( candidatefrom3 , candidatefrom5));

            uglyNumbers[position] = nextUglyNumber;

            if(nextUglyNumber == candidatefrom2){
                multiplyby2++;
            }
            if(nextUglyNumber == candidatefrom3){
                multiplyby3++;
            }
            if(nextUglyNumber == candidatefrom5){
                multiplyby5++;
                                            
            }
            
        }
        return uglyNumbers[n-1];
    }
}
