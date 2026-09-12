class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i = 0 ; i < citations.length ; i++){
            int Hindex = citations.length - i;

            if(citations[i] >= Hindex){
                return Hindex;
            }

        }
        return 0;
        
    }
}
//hindex can be defined as if there are 3 papers published then there must must at least 3 citiations
//in that paper 
// citations = [3,0,6,1,5]
//eg:paper A =  3 citations
//paper B = 0 citations
//paper C = 6 ; D = 1 ; E = 5
// H index = atleast H paper must have got H citations
//eg : let H = 1 then paper A , C , D , E(atlest 1 paper has got 1 citation ) correct
//if H = 2 then two papers must have gotten 2 citations
// but for H = 4 , no 4 papers have got 4 citations so incorrect H index , till now Hindex = 3;

// intution : agar ham ek nums[i] pe khade hai to usse age valo ke citations nums[i] se to jada hi honge
// now ho find how many papers are after nums[i]
//we do nums.length - i >> h imdex

// suppose for i = 1 : paper left (h index = 5 - 1) = 4
// now citations at index 1 = 1 so check is 1 >= 4 no so i++
//simply check karo 5 se 0 tak ki aane vala citations[i]  agar usse chota hai to age ki papers ki liye utne citations availabe honge aur vo nums.length - i hi Hindex hoga.
