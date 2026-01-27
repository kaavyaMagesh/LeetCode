class Solution(object):
    def maximumUnits(self, boxTypes, truckSize):
        """
        :type boxTypes: List[List[int]]
        :type truckSize: int
        :rtype: int
        """
        tot_units=0
        count=truckSize
        boxTypes.sort(key= lambda x:x[1],reverse=True)
        for box in boxTypes:
            
            if box[0]<count:
             tot_units+=box[0]*box[1]
             count-=box[0]
            else:
             tot_units+=count*box[1]
             break
        return tot_units
             

       