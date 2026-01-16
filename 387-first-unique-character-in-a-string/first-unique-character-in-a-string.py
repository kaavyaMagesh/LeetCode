class Solution:
    def firstUniqChar(self, s: str) -> int:
        hm={}
        for i in s:
            hm[i]=hm.get(i,0)+1
        for i in s:
            if hm[i]==1:
                return s.index(i)
            else:
                continue
        return -1