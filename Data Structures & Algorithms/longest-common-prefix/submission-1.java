class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        int i=0;
        StringBuilder prefix= new StringBuilder("");
        while(i<first.length()){
         for(int j=0;j<strs.length;j++){
            if(i>=strs[j].length()){
                return prefix.toString();
            }
            if(first.charAt(i)!=strs[j].charAt(i)){
                return prefix.toString();
            }
         }
         prefix.append(first.charAt(i));
         i++;
        }
        return prefix.toString();
    }
}