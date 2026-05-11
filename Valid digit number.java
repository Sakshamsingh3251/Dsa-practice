class Solution {
    public boolean validDigit(int n, int x) {
        boolean  flag = false;
        while(n != 0){
            int a = n % 10;
            if(a == x){
                flag = true;
            }
            if(n < 10 && a == x){
                flag = false;
            }
            
            n = n/ 10;
        }
        return flag;
    }
}
