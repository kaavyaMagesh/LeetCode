class Solution(object):
    def maxRunTime(self, n, batteries):
        """
        :type n: int
        :type batteries: List[int]
        :rtype: int
        """
        low = 0
        high = sum(batteries) // n
        ans = 0

        while low <= high:
            mid = (low + high) // 2
            total = 0

            for b in batteries:
                total += min(b, mid)

            if total >= n * mid:
                ans = mid
                low = mid + 1
            else:
                high = mid - 1

        return ans
