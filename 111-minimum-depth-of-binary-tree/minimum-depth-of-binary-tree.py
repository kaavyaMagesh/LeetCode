# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def minDepth(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        if not root:
            return 0
        queue=deque([(root,1)])
        while queue:
            node,level=queue.popleft()
            if not node.left and not node.right:
                return level
            if node.left: queue.append((node.left,level+1))
            if node.right:queue.append((node.right,level+1))
        return 0

        