class NumArray {
int[] prefix;
    public NumArray(int[] nums) {
         prefix=new int[nums.length+1];
        prefix[0]=0;
//for the extra 0th index
for(int i=0;i<nums.length;i++){
prefix[i+1]=prefix[i]+nums[i];
//nums[i] is the current i value because prefix is move behind

}

    }
    
    public int sumRange(int left, int right) {
    
        return prefix[right+1]-prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */