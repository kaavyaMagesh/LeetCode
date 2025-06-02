class Solution(object):
    def categorizeBox(self, length, width, height, mass):
        volume=length*width*height
        bulky=0
        heavy=0
        h="Heavy"
        b="Bulky"
        n="Neither"
        bo="Both"
        if length>=10000 or width>=10000 or height>=10000 or mass>=10000 or volume>=10**9:
         bulky=1
        
        if mass>=100:
            heavy=1
        if bulky==1 and heavy==1:
            return bo
        elif bulky==0 and heavy==1:
            return h
        elif heavy==0 and bulky==1:
            return b
        else:
            return n