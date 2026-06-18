public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long low = 1;
        long high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            int res = guess((int) mid);

            if (res == 0) {
                return (int) mid;
            } else if (res == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}