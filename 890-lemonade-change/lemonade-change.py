class Solution(object):
    def lemonadeChange(self, bills):
        """
        :type bills: List[int]
        :rtype: bool
        """
        five=ten=0

        for i in bills:
            if i==5:
                five+=1
            elif i==10:
                 if five==0:
                    return False
                 else:
                    five-=1
                    ten+=1
            else:
                if ten>0 and five>0:
                    five-=1
                    ten-=1
                elif five>=3:
                    five-=3
                    # putting five>=3 as first 'if' would be wrong greedy order
                    '''$10 + $5  (better)
                       over
                       $5 + $5 + $5
                       Why?
                       $5 bills are more flexible for future customers

'''
                else:
                    return False

        return True
        