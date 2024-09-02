class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        prev_idx = 0  # This will keep track of the index to place the non-zero elements
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[prev_idx], nums[i] = nums[i], nums[prev_idx]
                prev_idx += 1