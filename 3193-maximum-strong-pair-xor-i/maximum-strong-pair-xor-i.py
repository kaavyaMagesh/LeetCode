class Solution(object):
    def maximumStrongPairXor(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_xor = 0
        n = len(nums)
        
        for i in range(n):
            for j in range(i, n):
                if abs(nums[i] - nums[j]) <= min(nums[i], nums[j]):
                    xor_val = nums[i] ^ nums[j]
                    if xor_val > max_xor:
                        max_xor = xor_val
        
        return max_xor
