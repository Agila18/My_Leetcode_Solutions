class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l=[]
        if len(nums)==0 or target not in nums:
            return [-1,-1]
        else:
            for i in range(len(nums)):
                if nums[i]==target:
                    l.append(i)
           
            return [l[0],l[-1]]