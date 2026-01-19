class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l,r=0,len(numbers)-1
        sum=0
        while l<r:
            sum=numbers[l]+numbers[r]
            if sum==target:
                return [l+1,r+1]
            elif sum<target:
                sum=0
                l+=1
            else:
                r-=1
                sum=0
        return -1          
            