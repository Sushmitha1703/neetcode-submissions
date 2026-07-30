class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String words: strs){
            int[] count = new int[26];
            for(int i=0;i<words.length();i++){
                char ch= words.charAt(i);
                count[ch-'a']++;
            }
            String countArr = Arrays.toString(count);
            map.computeIfAbsent(countArr,f-> new ArrayList<>()).add(words);
        }
        return new ArrayList<>(map.values());
    }
}