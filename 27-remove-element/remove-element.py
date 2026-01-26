class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        l=0
        count=0
        for r in range(len(nums)):
            if nums[r]!=val:
                 nums[l]=nums[r]
                 l+=1
                 count+=1
        return count

        