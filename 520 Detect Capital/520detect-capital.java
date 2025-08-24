class Solution {
    public boolean detectCapitalUse(String word) {
        int upper_count=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c))    upper_count++;
        }
        if(upper_count==word.length())  return true;
        else if(upper_count==0)  return true;
        else if(upper_count==1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}