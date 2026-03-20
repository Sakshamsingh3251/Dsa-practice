class Solution {
    public int trailingZeroes(int n) {
       int trailingzero = 0;
       //10 = 2 x 5 
       while(n>0){
        n= n / 5;
        //no of zeroes are count if they are divisible by 5 and the quotient are the no of zeroes they contain like 20! is 
        trailingzero += n;
       }
       return trailingzero;

    }
}
