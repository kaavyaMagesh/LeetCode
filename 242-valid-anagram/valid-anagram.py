class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s)!=len(t):
            return False
        sp={}

        for i in s:
          if i in sp:
           sp[i]+=1
          else:
           sp[i]=1

        tp={}
        
        for j in t:
          if j in tp:
           tp[j]+=1
          else:
           tp[j]=1

        return sp==tp

