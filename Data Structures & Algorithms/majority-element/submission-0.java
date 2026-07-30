class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount=0;
        int maxVal=0;
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int val = entry.getValue();
            if(val>maxCount){
                maxCount = val;
                maxVal = num;
            }
        }
        return maxVal;
    }
}