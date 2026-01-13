class Solution(object):
    def separateSquares(self, squares):
        """
        :type squares: List[List[int]]
        :rtype: float
        """
        low,high,tot_area=float('inf'),float('-inf'),0
        for x,y,l in squares:
            tot_area+=l*l
            low=min(y,low)
            high=max(y+l,high)
        
        target_area=tot_area/2.0

        for i in range(60):
            mid=(high+low)/2.0

            curr_area=0

            for _,y,l in squares:
                curr_y=max(0,min(mid-y,l))
                curr_area+=curr_y*l

            if curr_area < target_area:
                low = mid
            else:
                high = mid


        return mid
        
        