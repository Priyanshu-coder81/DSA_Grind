class Solution {

    public int distinctPoints(String s, int k) {
        int n = s.length();
       
        int[] px = new int[n + 1]; 
        int[] py = new int[n + 1]; 

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            px[i + 1] = px[i];
            py[i + 1] = py[i];
            if (c == 'U') py[i + 1]++;
            else if (c == 'D') py[i + 1]--;
            else if (c == 'L') px[i + 1]--;
            else px[i + 1]++;
        }

        HashSet<String> hset = new HashSet<>();
        for (int i = 0; i <= n - k; i++) {
            int x = px[i] + (px[n] - px[i + k]);
            int y = py[i] + (py[n] - py[i + k]);
            hset.add(x + "," + y);
        }

        return hset.size();
    }
}