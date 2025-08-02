class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0,i=num1.length()-1,j=num2.length()-1;
        StringBuilder str=new StringBuilder();
        while(i>=0||j>=0||carry!=0){
            int n1=(i>=0)? num1.charAt(i)-'0':0;
            int n2=(j>=0)? num2.charAt(j)-'0':0;
            i--;
            j--;
            int sum=n1+n2+carry;
            str.append(sum%10);
            carry=sum/10;
        }
        return str.reverse().toString(); 
    }
}