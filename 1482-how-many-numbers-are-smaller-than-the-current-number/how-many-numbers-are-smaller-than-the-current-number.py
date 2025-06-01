class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        size = len(nums)
        newlis = []
        for i in range(size):
            count = 0
            for j in range(size):
                if j != i and nums[i] > nums[j]:
                    count += 1
            newlis.append(count)
        return newlis

        