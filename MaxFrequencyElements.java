class Solution {
    public int maxFrequencyElements(int[] nums) {
       int arr[] = new int[101];
       for(int i : nums) {
        arr[i]++;
       }
    int max = 0;
       for(int i : arr) {
        max = Math.max(max,i);
       }
       int cnt = 0;
for(int i = 0; i<101; i++) {
    if(arr[i] == max) {
        cnt++;
    }
}
    return cnt*max;
    }
}
