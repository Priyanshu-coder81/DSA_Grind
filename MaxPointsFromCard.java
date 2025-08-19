class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;
        long sum = 0;

        for(int i =0; i<n; i++) {
            sum+=cardPoints[i];
        }
        int j;
        long sumTillJ = 0;
        for(j = 0; j<n-k; j++){
            sumTillJ += cardPoints[j];
        }

        long min = sumTillJ;
        int i  = 0;
        while(j<n) {
            sumTillJ += cardPoints[j++];
            sumTillJ -= cardPoints[i++];
            min = Math.min(min,sumTillJ);
        }
        return (int)(sum - min);
    }
}