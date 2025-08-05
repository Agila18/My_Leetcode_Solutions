class Solution {
    public int countAsterisks(String s) {
        int c=0;
        boolean flag=true;
        for(char z:s.toCharArray()){
            if(z=='|'){
                flag=!flag;
            }
            else if(z=='*'&& flag==true){
                c++;
            }
        }
        return c;
    }
}