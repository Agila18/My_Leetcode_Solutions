class Solution {
    static {
        for(int i = 0; i < 500; i++)
            mergeArrays(null, null);
    }
    public static int[][] mergeArrays(int[][] items1, int[][] items2) {
        if(items1 == null) 
            return new int[][]{{}};

        int[] mark = new int[1001];

        for (int i = 0; i < items2.length; i++) {
            mark[items2[i][0]] = items2[i][1];
        }

        for (int i = 0; i < items1.length; i++) {
            mark[items1[i][0]] += items1[i][1];
        }

        int count = 0;
        for (int i = 0; i < 1001; i++) {
            if (mark[i] > 0) {
                count++;
            }
        }
        
        int[][] arr = new int[count][2];
        int idx = 0;

        for (int i = 0; i < 1001; i++) {
            if (mark[i] > 0) {
                arr[idx][0] = i;
                arr[idx][1] = mark[i];
                idx++;
            }
        }

        return arr;
    }
}