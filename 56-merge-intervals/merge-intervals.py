class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key =lambda x:x[0])
        merged=[]

        for s,e in intervals:
            if not merged or s > merged[-1][1]:
             merged.append([s,e])
            else: #ie s<= merged[-1][1]
             merged[-1][1]=max(merged[-1][1],e)
        return merged