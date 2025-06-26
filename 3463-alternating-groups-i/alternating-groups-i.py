class Solution(object):
    def numberOfAlternatingGroups(self, colors):
        """
        :type colors: List[int]
        :rtype: int
        """
        n = len(colors)
        count = 0
        for i in range(n):
            a = colors[i]
            b = colors[(i + 1) % n]
            c = colors[(i + 2) % n]

            if a != b and b != c and a == c:
                count += 1
        return count