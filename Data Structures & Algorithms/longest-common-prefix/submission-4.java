class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        StringBuilder prefix = new StringBuilder("");
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return prefix.toString();
                }
                if (first.charAt(i) != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(first.charAt(i));
        }
        return prefix.toString();
    }
}