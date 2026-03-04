class Solution {
    public int searchInsert(int[] nums, int target) {
        int i,index=nums.length;
        for(i=0 ; i<nums.length ; i++){
            if(nums[i]>=target){
                index=i;
                break;
            }
        }
        return index;
    }
}
