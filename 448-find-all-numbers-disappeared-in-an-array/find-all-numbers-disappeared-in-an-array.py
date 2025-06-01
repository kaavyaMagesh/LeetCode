class Solution(object):
    def findDisappearedNumbers(self, nums):
        size = len(nums)
        num_set = set(nums)
        result = []

        for i in range(1, size + 1):
            if i not in num_set:
                result.append(i)

        return result
