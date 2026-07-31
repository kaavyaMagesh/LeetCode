class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int[] ans=new int[nums.length];

while(left<=right){
    int leftAbs=Math.abs(nums[left]);
    int rightAbs=Math.abs(nums[right]);
    
 if(leftAbs>rightAbs){
ans[index]=nums[left]*nums[left];
left++;
    }else{
        ans[index]=nums[right]*nums[right];
        right--;
    }
index--;
}
return ans;
    }
}