// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length() ){
//             return false;
//         }
//         return (s+s).contains(goal);
//     }
// }
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        s += s;
        if(s.contains(goal)){
            return true;
        }
        return false;
    }
}
