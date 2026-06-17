class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List <List<Integer>> result=new ArrayList<>();
        backtrack(0,nums.length,nums,result);
        return result;
           }

        private void backtrack(int start,int end,int[]nums,List<List<Integer>> result){
            if (start==end){
                List<Integer> permutation=new ArrayList<>();

                for(int num : nums){
                    permutation.add(num);
                }
                result.add(permutation);
            }
            for(int i=start;i<end;i++){
            int temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
            backtrack(start+1,end,nums,result);
            temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
            }

        }
}