class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList(nums.length+1);

        for(int i=0;i<nums.length+1;i++){
            list.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            list.get(entry.getValue()).add(entry.getKey());
        }

        int[] res = new int[k];
        int index=0;
        for(int i = nums.length;i>=0;i--){
            for(int n: list.get(i)){
                res[index++]=n;
                if(index==k){
                    return res;
                }
            }
        }

        return res;
    }
}
