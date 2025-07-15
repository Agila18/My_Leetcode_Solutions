class Solution:
    def findLucky(self, arr: List[int]) -> int:
        d=dict()
        l=[]
        for i in arr:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        for i in d:
            if d[i]==i:
                l.append(i)
        if len(l)>=1:
            return max(l)
        else:
            return -1
        