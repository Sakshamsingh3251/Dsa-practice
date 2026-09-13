class Solution {
    public void reverse(char[] arr , int l , int r){
        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverse(arr , 0 , arr.length - 1);
        
        int i = 0;
        int l = 0;
        int r = 0;
        int n = arr.length;

        while(i < n){
            while (i < n && arr[i] == ' ') {
                i++;
            }
            //l = r;

            while( i < n && arr[i] != ' '){
                arr[r] = arr[i];
                r++;
                i++;
            }
            if(l < r){
                reverse(arr , l , r-1);
                int j = i;
                while(j < n && arr[j] == ' '){
                    j++;
                }
                if (j < n) {
                    arr[r++] = ' ';
                }
                l = r;
            }
            i++;
        }
        return new String(arr , 0 , r);
    }
}
