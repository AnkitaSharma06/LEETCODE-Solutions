class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int evenCount=0;
        for( int i  =0 ; i < nums.length ; i++ ){
            int x = nums[i];

            int temp = Math.abs(nums[i]);

            if(nums[i]==0){
                count=1;
            }
            else{
                while(x > 0){
                x = x/10;
                count++;
                }
            }
            if(count % 2 == 0){
                evenCount++;
            }
        count=0;
        }
    return evenCount;
    }
}
