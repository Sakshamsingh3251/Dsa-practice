class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int i = -1;

        for(char ch : s.toCharArray()){
            if(ch>='0' && ch<='9'){
                //checking if charcter is not a digit
                sb.deleteCharAt(i--);
                //array se ek ek string ele nikalne ke liye
            }
            else{
                sb.append(ch);
                //string me charceters to store karne ke liye
                i++;
            }
        }
        return sb.toString();
        //phir se string me convert kiya hai
    }
}
