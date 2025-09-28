class Solution {
    public String majorityFrequencyGroup(String s) {
        int n = s.length();
        int a[] = new int[26];
        for(char c : s.toCharArray()) {
            a[c-'a']++;
        }
       
        int bestSize = 0, bestFreq = 0;
        String best = "";

        for (int k = 1; k <= s.length(); k++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (a[i] == k) sb.append((char) ('a' + i));
            }
            if (sb.length() > 0) {
                if (sb.length() > bestSize || (sb.length() == bestSize && k > bestFreq)) {
                    bestSize = sb.length();
                    bestFreq = k;
                    best = sb.toString();
                }
            }
        }
        return best;
    }
}