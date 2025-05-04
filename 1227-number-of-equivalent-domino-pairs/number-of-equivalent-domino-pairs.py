class Solution(object):
    def numEquivDominoPairs(self, dominoes):
        from collections import defaultdict
        
        count_map = defaultdict(int)
        count = 0

        for a, b in dominoes:
            key = tuple(sorted((a, b)))  # normalize to (min, max)
            count += count_map[key]
            count_map[key] += 1

        return count
