class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total=0;
        int l=0;

        int minLen=Integer.MAX_VALUE;
        
        for(int r=0;r<nums.length;r++){
            total+=nums[r];
        
         
        while(total>=target){
            minLen=Math.min(minLen,r-l+1);
             total-=nums[l];
            l++;
        }

        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        return minLen;

    }
}