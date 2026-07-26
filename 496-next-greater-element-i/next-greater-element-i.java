class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
       HashMap<Integer,Integer> nxtGrtmap=new HashMap<>();
       Stack<Integer> stack=new Stack<>();
/*1. Traverse nums2 from right to left because the next greater element
   must always be on the right. By moving backwards, we've already
   processed everything to the right of the current element.
 */
       for(int i=nums2.length-1;i>=0;i--)//move backwards in nums 2
       {
while(!stack.isEmpty() && stack.peek()<=nums2[i]){
    stack.pop();
    /*
   The stack stores only useful candidate numbers from the right that are not lesser than current num*/
}
if(stack.isEmpty()){
    nxtGrtmap.put(nums2[i],-1);
}else{
    nxtGrtmap.put(nums2[i],stack.peek());
}

/*Before processing the current number:
   - Pop all elements <= current because they can never be the next
     greater element for the current number or for any element further left.
   - After popping:
       • If the stack is empty, there is no greater element on the right,
         so map.put(current, -1).
       • Otherwise, stack.peek() is the FIRST greater element on the right
         (not the largest), so map.put(current, stack.peek()). */
stack.push(nums2[i]);
/*Push the current number onto the stack so it can act as a candidate
   next greater element for numbers to its left. */
       }

int [] ans=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
ans[i]=nxtGrtmap.get(nums1[i]);
// After building the map for nums2, simply look up every element of
   //nums1 in the map to build the answer.

      }
      return ans;
}
}
