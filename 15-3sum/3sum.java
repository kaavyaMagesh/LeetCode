class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

int sum=0;

//function to sort arrays
Arrays.sort(nums);

//create an arraylist that will contain lists of integer
ArrayList<List<Integer>> ans=new ArrayList<>();

//nums.length-2 because we are using left and right pointers--> 2 pointers-> to search space beyond i so we need to stop atleast before the last two characters to not get out of bound indexing error

        for(int i=0;i<nums.length-2;i++){

    if(i!=0 && nums[i]==nums[i-1]){ //check if there are any duplicates if so skip them
    continue;
}
int l=i+1;//left pointer will be i+1
int r=nums.length-1;//right pointer will be the last index

while(l<r){ //while left and right dont cross each other
//Once they meet or cross, there are no more valid pairs to check.

/*l < r ensures:

The pointers still represent two different elements.
We stop as soon as the search space is exhausted.
 */
 sum=nums[i]+nums[l]+nums[r]; //check sum
        if(sum<0){
            l++; //if sum is negative then increment l(remember array is in increasing order)
        }else if(sum>0){
            r--; //if sum is too +ve decrement r
        }else{
           ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
            l++;
            r--;
            while(l<r && nums[l]==nums[l-1]){
              l++;//skip if there are duplicates for left pointer
            }
             while(l<r && nums[r]==nums[r+1]){
                r--;
            }
        }
    }
}
    return ans;
    }
}