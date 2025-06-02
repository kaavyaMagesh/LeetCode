class Solution(object):
    def isValid(self, s):
        stack = []
        mapping = {')': '(', ']': '[', '}': '{'}

        for char in s:
            if char in mapping.values():
                stack.append(char)  # opening bracket
            elif char in mapping:
                if not stack or stack[-1] != mapping[char]:
                    return False  # mismatch
                stack.pop()  # matched pair
            else:
                return False  # invalid character (optional)

        return not stack  # stack must be empty if valid
