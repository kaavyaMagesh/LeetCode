class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();

        int index=0;
        int n=nums.length;
        int [] ans=new int[n-k+1];

        for(int i=0;i<n;i++){

//removes old  indices from window, from front
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
//remove smaller vlues from window, through last
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
//store max elt once window max size is reached
            if(i>=k-1){
ans[index++]=nums[dq.peekFirst()];
            }


        }
        return ans;
    }
}
