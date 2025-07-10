class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = ""
        s = s.lower()
        
        if s == " " or s == "" or len(s) == 1:
            return True
        else:
            for i in s:
                if i.isalnum():  # Only keep letters and digits
                    s1 += i
            
            if s1 == s1[::-1]:
                return True
            else:
                return False
