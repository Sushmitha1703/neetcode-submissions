class Solution {
    public int removeElement(int[] nums, int val) {
        int p1=0;
        int p2=0;
        while(p1< nums.length){
           if(nums[p1]==val){
              p1++;
           }
           else{
            nums[p2]=nums[p1];
            p1++;
            p2++;
           }
        }
        return p2;
    }
}