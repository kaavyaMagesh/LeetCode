class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hp={}
        for i in nums:
            if i in hp:
                hp[i]+=1
            else:
                hp[i]=1
        n=len(nums)
        for i in nums:
            if hp[i]>n/2:
             return i
            else:
             continue