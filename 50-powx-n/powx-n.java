class Solution {
    public double myPow(double x, int n) {

        long exp = n;

        if(exp < 0) {
            exp = -exp;
        }

        double ans = 1;

        while(exp > 0) {

            if(exp % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            exp = exp / 2;
        }

        if(n < 0) {
            return 1 / ans;
        }

        return ans;
    }
}