class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int maxVal = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > maxCount) {
                maxVal = num;
                maxCount = map.get(num);
            }
        }
        return maxVal;
    }
}