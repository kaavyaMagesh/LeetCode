class Solution(object):
    def countTriplets(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        n=len(arr)
        ans=0
        for i in range(n):
            xor_val=0
            for k in range(i,n):
                xor_val^=arr[k]
                if xor_val==0:
                    ans+=k-i       
        return ans