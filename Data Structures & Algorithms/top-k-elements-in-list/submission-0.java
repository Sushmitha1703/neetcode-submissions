class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(freq.entrySet());

        list.sort((a,b)-> b.getValue()-a.getValue());

        int[] result = new int[k];

        for(int i=0;i<k;i++){
            result[i]=list.get(i).getKey();
        }

    return result;
    }
}
