class Solution:
    def frequencySort(self, s: str) -> str:
        hashmap={}
        for c in s:
            if c in hashmap:
               hashmap[c]+=1
            else:
              hashmap[c]=1
        sorted_list=sorted(hashmap.items(),key=lambda x: x[1],reverse=True)

        ans=""
        for chr,freq in sorted_list:
            ans+=chr*freq

        return ans