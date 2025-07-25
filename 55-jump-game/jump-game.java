class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int maxreach = nums[0];
        int lastIndex = nums.length - 1;

        for (int i = 1; i <= maxreach; i++) {
            maxreach = Math.max(maxreach, i + nums[i]);
            if (maxreach >= lastIndex) {
                return true;
            }
        }
        return false;
    }
}
