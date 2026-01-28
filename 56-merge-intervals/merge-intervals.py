class Solution(object):
    def merge(self, intervals):
        if not intervals:
            return []

        intervals.sort(key=lambda x: x[0])

        write = 0  # write index

        for i in range(1, len(intervals)):
            # overlap
            if intervals[write][1] >= intervals[i][0]:
                intervals[write][1] = max(intervals[write][1], intervals[i][1])
            else:
                write += 1
                intervals[write] = intervals[i]

        return intervals[:write+1]
