class Solution(object):
    def removeDuplicates(self, s):
        """
        :type s: str
        :rtype: str
        """
        stac=[]
    
        for c in s:
          if stac and stac[-1]==c:
                stac.pop()
          else:
                stac.append(c)
        return "".join(stac)