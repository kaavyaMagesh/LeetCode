class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        i=len(s)-1

        while i>=0 and s[i]==" ":
            i-=1 # to skip over the trailing spaces that are present towards the end of the sentence
        end=i 
        count=0
        while i>=0 and s[i]!=" ":
            i-=1
            count+=1
        return count

       # return s[i+1:end+1] to return the word itself