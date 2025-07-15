class Solution:
    def isValid(self, word: str) -> bool:
       l=len(word)
       s=word.isalnum() or word.isalpha() or word.isdigit()
       vow,con=0,0
       for i in word:
         if i.isalpha() and i in ['a','e','i','o','u','A','E','I','O','U'] :
            vow+=1
         elif i.isalpha() and i not in ['a','e','i','o','u','A','E','I','O','U']:
            con+=1
       if l>=3 and s and vow>=1 and con>=1:
        return True
       else:
        return False 