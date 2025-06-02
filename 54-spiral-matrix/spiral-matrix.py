class Solution(object):
    def spiralOrder(self, matrix):
        left = 0
        top = 0
        right = len(matrix[0]) - 1
        bottom = len(matrix) - 1
        res = []

        while top <= bottom and left <= right:
            # left to right
            i = left
            while i <= right:
                res.append(matrix[top][i])
                i += 1
            top += 1

            # top to bottom
            j = top
            while j <= bottom:
                res.append(matrix[j][right])
                j += 1
            right -= 1

            # right to left
            if top <= bottom:
                k = right
                while k >= left:
                    res.append(matrix[bottom][k])
                    k -= 1
                bottom -= 1

            # bottom to top
            if left <= right:
                p = bottom
                while p >= top:
                    res.append(matrix[p][left])
                    p -= 1
                left += 1

        return res
