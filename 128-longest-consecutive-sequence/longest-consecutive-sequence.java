class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set1=new HashSet<>();

for(int i:nums){
set1.add(i);
}


int current=0;
int length=0;
int longest=0;
for(int num:set1){

if(!set1.contains(num-1)){

current=num;
length=1;
while(set1.contains(current+1)){
current++;
length++;
}

longest=Math.max(longest,length);
}
       
}
 return longest;
    }
}