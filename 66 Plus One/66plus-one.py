class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s="".join(str(i) for i in digits)
        i=int(s)
        res=str(i+1)
        l=[]
        for i in range(len(res)):
            l.append(res[i])
        return [int(i) for i in l]